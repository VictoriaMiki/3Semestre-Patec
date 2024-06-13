package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import util.BD;

/**
 * Classe DAO (Data Access Object) responsável por trocar informações com o SGBD
 * através de operações referentes a objetos da Classe Aluno.
 */
public class AlunoDAO {

	private BD bd;
	private String sql, men;

	/**
	 * Cria uma nova instância de <code>AlunoDAO</code>, e inicializa o atributo
	 * <code>bd</code>, que será utilizado para estabelecer conexão com o banco de
	 * dados.
	 * 
	 * @see BD
	 */
	public AlunoDAO() {
		bd = new BD();
	}

	/**
	 * Registra os dados contidos na instância da classe <code>Aluno</code> no banco
	 * de dados.
	 * <p>
	 * Caso os dados não existam no banco de dados, será criado um novo registro
	 * contendo eles; Caso existam, os dados serão atualizados tendo como base o
	 * registro cujo identificador está contido no atributo <code>ra</code>.
	 * 
	 * @param a - a instância da classe <code>Aluno</code>.
	 * @return Uma <code>String</code> que informa se a operação de
	 *         inserção/alteração foi bem-sucedida ou não.
	 * @see Aluno
	 */
	public String gravar(Aluno a) {
		sql = "SET DATEFORMAT 'DMY'; INSERT INTO ALUNO VALUES (?, ?, ?, ?)";
		men = "Aluno inserido com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, a.getRa());
			bd.st.setString(2, a.getCpf());
			bd.st.setString(3, a.getNomeAluno());
			bd.st.setString(4, a.getDataNascimento());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch (SQLException e) {
			sql = "SET DATEFORMAT 'DMY'; UPDATE ALUNO SET cpf = ?, nome_aluno = ?, data_nascimento = ? WHERE ra = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, a.getCpf());
				bd.st.setString(2, a.getNomeAluno());
				bd.st.setString(3, a.getDataNascimento());
				bd.st.setString(4, a.getRa());
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					men = "Aluno alterado com sucesso!";
				} else {
					men = "Aluno não encontrado!";
				}
			} catch (SQLException e2) {
				men = "Falha" + e;
				System.out.println(men);
			}
		} finally {
			bd.close();
		}
		return men;
	}

	/**
	 * Exclui o registro da tabela Aluno do banco de dados identificado pelo 
	 * <code>ra</code>.
	 * 
	 * @param ra - uma <code>String</code> que corresponde ao Registro do Aluno.
	 * @return Uma <code>String</code> que informa se a operação de exclusão foi
	 *         bem-sucedida ou não.
	 */
	public String excluir(Object ra) {
		sql = "DELETE FROM ALUNO WHERE ra = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setObject(1, ra);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluídas: " + n);
			if (n == 1) {
				men = "Aluno excluído com sucesso!";
			} else {
				men = "Aluno não encontrado!";
			}
		} catch (SQLException e) {
			men = "Falha" + e;
		} finally {
			bd.close();
		}
		return men;
	}

	/**
	 * Retorna os dados de um aluno contidos em uma instância de <code>Aluno</code>.
	 * <p>
	 * Este método utiliza o parâmetro <code>ra</code> como referência para a
	 * obtenção dos dados referentes àquele aluno.
	 * 
	 * @param ra - uma <code>String</code> que corresponde ao Registro do Aluno.
	 * @return Uma instância de <code>Alunos</code>, e seus respectivos valores
	 *         contidos nos atributos.
	 */
	public Aluno obterAluno(String ra) {
		BD bd = new BD();
		Aluno a = null;

		String sql = "SELECT * FROM ALUNO WHERE ra = ?;";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, ra);
			bd.rs = bd.st.executeQuery();
			if (bd.rs.next()) {
				a = new Aluno(bd.rs.getString("ra"), bd.rs.getString("cpf"), bd.rs.getString("nome_aluno"),
						bd.rs.getString("data_nascimento"));

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			bd.close();
		}

		return a;
	}

	/**
	 * Retorna os dados referentes às avaliações realizadas pelo Aluno identificado 
	 * pelo <code>ra</code> e na data de avaliação identificada pela <code>dataAvaliacao</code>.
	 * <p>
	 * Este método é utilizado para geração do relatório pelo Aluno.
	 * 
	 * @param ra - uma <code>String</code> que corresponde ao Registro do Aluno.
	 * @param dataAvaliacao - uma <code>String</code> que corresponde à Data de Realização da Avaliação.
	 * @return Um <code>Map<Integer, Object></code> com dados das <code>Folhas de Respostas</code> que foram preenchidas
	 * 			pelo Aluno informado na data informada. Dados: codigoDisciplina, nomeDisciplina, respostas 
	 * 			preenchidase a nota obtida em cada avaliação que o Aluno realizou.
	 */
	public Map<Integer, Object> GerarRelatorioAluno(String ra, String dataAvaliacao) {
		BD bd = new BD();
		Map<Integer, Object> matrizDados = new HashMap<>();

		String sql = "SELECT GABARITO_OFICIAL.codigo_disciplina, DISCIPLINA.nome_disciplina, FOLHA_DE_RESPOSTAS.resposta_1, FOLHA_DE_RESPOSTAS.resposta_2, FOLHA_DE_RESPOSTAS.resposta_3, FOLHA_DE_RESPOSTAS.resposta_4, FOLHA_DE_RESPOSTAS.resposta_5, FOLHA_DE_RESPOSTAS.nota FROM DISCIPLINA, FOLHA_DE_RESPOSTAS\r\n"
				+ "JOIN GABARITO_OFICIAL ON FOLHA_DE_RESPOSTAS.codigo_gabarito = GABARITO_OFICIAL.codigo_gabarito\r\n"
				+ "JOIN AVALIACAO ON GABARITO_OFICIAL.codigo_avaliacao = AVALIACAO.codigo_avaliacao\r\n"
				+ "WHERE DISCIPLINA.codigo_disciplina = GABARITO_OFICIAL.codigo_disciplina\r\n"
				+ "AND FOLHA_DE_RESPOSTAS.ra = ? AND AVALIACAO.data_avaliacao = ?;";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, ra);
			bd.st.setString(2, dataAvaliacao);
			bd.rs = bd.st.executeQuery();
			int i = 0;
			while (bd.rs.next()) {
				ArrayList<Object> vetorDados = new ArrayList<>();
				vetorDados.add(bd.rs.getString("codigo_disciplina"));
				vetorDados.add(bd.rs.getString("nome_disciplina"));
				vetorDados.add(bd.rs.getString("resposta_1"));
				vetorDados.add(bd.rs.getString("resposta_2"));
				vetorDados.add(bd.rs.getString("resposta_3"));
				vetorDados.add(bd.rs.getString("resposta_4"));
				vetorDados.add(bd.rs.getString("resposta_5"));
				vetorDados.add(bd.rs.getInt("nota"));
				matrizDados.put(i, vetorDados);
				i++;
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			bd.close();
		}

		return matrizDados;
	}

}

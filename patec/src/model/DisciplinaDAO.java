package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.BD;

public class DisciplinaDAO {

	private BD bd;
	private String sql, men;

	/**
	 * Cria uma nova instância de <code>DisciplinaDAO</code>, e inicializa o
	 * atributo <code>bd</code>, que será utilizado para estabelecer conexão com o
	 * banco de dados.
	 * 
	 * @see BD
	 */
	public DisciplinaDAO() {
		bd = new BD();
	}

	/**
	 * Registra os dados contidos na instância da classe <code>Disciplina</code> no
	 * banco de dados.
	 * <p>
	 * Caso os dados não existam no banco de dados, será criado um novo registro
	 * contendo eles; Caso existam, os dados serão atualizados tendo como base o
	 * registro cujo código está contido no atributo <code>codDisciplina</code>.
	 * 
	 * @param d - a instância da classe <code>Disciplina</code>.
	 * @return Uma <code>String</code> que informa se a operação de
	 *         inserção/alteração foi bem-sucedida ou não.
	 * @see Disciplina
	 */
	public String gravar(Disciplina d) {
		sql = "INSERT INTO DISCIPLINA VALUES (?, ?, ?)";
		men = "Disciplina inserida com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, d.getCodigoDisciplina());
			bd.st.setString(2, d.getNomeDisciplina());
			bd.st.setInt(3, d.getSemestreDisciplina());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch (SQLException e) {
			sql = "UPDATE DISCIPLINA SET nome_disciplina = ?, semestre_disciplina = ? WHERE cod_disciplina = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, d.getNomeDisciplina());
				bd.st.setInt(2, d.getSemestreDisciplina());
				bd.st.setString(3, d.getCodigoDisciplina());
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					men = "Disciplina alterada com sucesso!";
				} else {
					men = "Disciplina não encontrada!";
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
	 * 
	 * @param codDisciplina
	 * @return Uma <code>String</code> que informa se a operação de exclusão foi
	 *         bem-sucedida ou não.
	 */
	public String excluir(Object codDisciplina) {
		sql = "DELETE FROM DISCIPLINA WHERE cod_disciplina = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setObject(1, codDisciplina);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluídas: " + n);
			if (n == 1) {
				men = "Disciplina excluída com sucesso!";
			} else {
				men = "Disciplina não encontrada!";
			}
		} catch (SQLException e) {
			men = "Falha" + e;
		} finally {
			bd.close();
		}
		return men;
	}

	/**
	 * 
	 * @param ra
	 * @return listaSemestres
	 */
	public List<String> listarSemestres(String ra) {
		List<String> listaSemestres = new ArrayList<String>();
		listaSemestres.add("-- selecione uma semestre --");
		BD bd = new BD();
		if (bd.getConnection()) {
			String sql = "SELECT DISTINCT D.semestre_disciplina " + "FROM DISCIPLINA D "
					+ "JOIN ALUNO_DISCIPLINA AD ON D.cod_disciplina = AD.codigo_disciplina "
					+ "JOIN ALUNO A ON A.ra = AD.ra " + "WHERE A.ra = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, ra);
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					listaSemestres.add(bd.rs.getString("semestre_disciplina") + "° SEM");
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}

		return listaSemestres;
	}

	/**
	 * 
	 * @param ra
	 * @param semestre
	 * @return listaDisciplinas
	 */
	public List<String> listarDisciplinas(String ra, int semestre) {
		List<String> listaDisciplinas = new ArrayList<String>();
		listaDisciplinas.add("-- selecione uma disciplina --");
		if (bd.getConnection()) {
			String sql = "SELECT DISCIPLINA.nome_disciplina FROM DISCIPLINA\r\n"
					+ "JOIN ALUNO_DISCIPLINA ON DISCIPLINA.cod_disciplina = ALUNO_DISCIPLINA.codigo_disciplina\r\n"
					+ "JOIN ALUNO ON ALUNO_DISCIPLINA.ra = ALUNO.ra\r\n"
					+ "WHERE ALUNO.ra = ? AND DISCIPLINA.semestre_disciplina = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, ra);
				bd.st.setInt(2, semestre);
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					listaDisciplinas.add(bd.rs.getString("nome_disciplina"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}

		return listaDisciplinas;
	}

	/**
	 * 
	 * @param disciplina
	 * @return obj
	 */
	public Map<String, Object> lerDisciplina(String disciplina) {
		Map<String, Object> obj = new HashMap<>();

		if (bd.getConnection()) {
			String sql = "SELECT TOP 1 D.*, G.cod_gabarito, A.data_avaliacao " + "FROM DISCIPLINA D "
					+ "JOIN GABARITO_OFICIAL G ON D.cod_disciplina = G.codigo_disciplina "
					+ "JOIN AVALIACAO A ON G.codigo_avaliacao = A.codigo_avaliacao "
					+ "WHERE D.nome_disciplina = ? AND DATEPART(DAYOFYEAR,A.data_avaliacao) >= DATEPART(DAYOFYEAR,GETDATE())"
					+ "ORDER BY A.data_avaliacao ASC";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, disciplina);
				bd.rs = bd.st.executeQuery();
				while (bd.rs.next()) {
					obj.put("nomeDisciplina", bd.rs.getString("nome_disciplina"));
					obj.put("codDisciplina", bd.rs.getString("cod_disciplina"));
					obj.put("codigoGabarito", bd.rs.getInt("cod_gabarito"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}

		return obj;
	}

	/**
	 * 
	 * @return arrayDisciplinas
	 */
	public String[] obterTodasDisciplinas() {
		List<String> listaDisciplinas = new ArrayList<String>();
		String sql = "SELECT nome_disciplina FROM DISCIPLINA";
		if (bd.getConnection()) {

			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					listaDisciplinas.add(bd.rs.getString("nome_disciplina"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}
		String[] arrayDisciplinas = new String[listaDisciplinas.size()];
		listaDisciplinas.toArray(arrayDisciplinas);
		return arrayDisciplinas;
	}

}

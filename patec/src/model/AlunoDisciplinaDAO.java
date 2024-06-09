package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.BD;

public class AlunoDisciplinaDAO {
	
	private BD bd;
	private String sql, men;

	public AlunoDisciplinaDAO() {
		bd = new BD();
	}

	public String gravar(AlunoDisciplina ad) {
		sql = "INSERT INTO ALUNO_DISCIPLINA VALUES (?, ?)";
		men = "Aluno cadastrado na Disciplina com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, ad.getCodigoDisciplina());
			bd.st.setString(2, ad.getRa());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch (SQLException e) {
			men = "Falha" + e;
			System.out.println(men);
		} finally {
			bd.close();
		}
		return men;
	}

	public String excluir(String ra) {
		sql = "DELETE FROM ALUNO_DISCIPLINA WHERE ra = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setObject(1, ra);
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
	
	public List<String> listarDisciplinasMatriculadas(String ra) {
		List<String> listaDisciplinas = new ArrayList<String>();
		String sql = "SELECT D.nome_disciplina " 
				+ "FROM DISCIPLINA D "
				+ "JOIN ALUNO_DISCIPLINA AD ON D.cod_disciplina = AD.codigo_disciplina "
				+ "WHERE AD.ra = ? "
				+ "ORDER BY D.nome_disciplina ASC";
		if (bd.getConnection()) {

			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, ra);
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
	
	public List<String> listarDisciplinasNaoMatriculadas(String ra) {
		List<String> listaDisciplinas = new ArrayList<String>();
		String sql = "SELECT D.nome_disciplina " 
				+ "FROM DISCIPLINA D "
				+ "LEFT JOIN ALUNO_DISCIPLINA AD ON D.cod_disciplina = AD.codigo_disciplina AND AD.ra = ? "
				+ "WHERE AD.codigo_disciplina IS NULL "
				+ "ORDER BY D.nome_disciplina ASC";
		if (bd.getConnection()) {

			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, ra);
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
	
	public String getDisciplinaPeloNome(String nome) {
		String codigo = "";
		String sql = "SELECT D.cod_disciplina " 
				+ "FROM DISCIPLINA D "
				+ "WHERE D.nome_disciplina = ?";
		if (bd.getConnection()) {

			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, nome);
				bd.rs = bd.st.executeQuery();

				while (bd.rs.next()) {
					codigo = bd.rs.getString("cod_disciplina");
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}
		return codigo;
	}
	
}

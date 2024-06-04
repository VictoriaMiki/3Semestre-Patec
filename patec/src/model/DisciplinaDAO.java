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

	public DisciplinaDAO() {
		bd = new BD();
	}

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

	public List<String> listarProvas(String ra, int semestre) {
		List<String> disciplinas = new ArrayList<String>();
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
					disciplinas.add(bd.rs.getString("nome_disciplina"));
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				bd.close();
			}
		} else {
			System.out.println("Falha na conexão.");
		}

		return disciplinas;
	}

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

	public String[] listarDisciplinas() {
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

package model;

import java.sql.SQLException;

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

	/*
	public List<Aluno> get(Aluno a) {
		sql = "SELECT * FROM ALUNO";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			// bd.st.setInt(1, id);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluídas: " + n);
			if (n == 1) {
				// men = "Produto excluido com sucesso!";
			} else {
				// men = "Produto não encontrado!";
			}
		} catch (SQLException e) {
			men = "Falha" + e;
		} finally {
			bd.close();
		}
		return men;
	}
	*/

}

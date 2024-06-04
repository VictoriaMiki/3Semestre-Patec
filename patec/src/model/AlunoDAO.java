package model;

import java.sql.SQLException;

import util.BD;

public class AlunoDAO {

	private BD bd;
	private String sql, men;

	public AlunoDAO() {
		bd = new BD();
	}

	public String gravar(Aluno a) {
		sql = "INSERT INTO ALUNO VALUES (?, ?, ?, ?)";
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
			sql = "UPDATE ALUNO SET cpf = ?, nome_aluno = ?, data_nascimento = ? WHERE ra = ?";
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

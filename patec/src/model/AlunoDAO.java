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

}

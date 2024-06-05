package model;

import java.sql.SQLException;

import util.BD;

public class AvaliacaoDAO {

	private BD bd; 
	private String sql, men;

	public AvaliacaoDAO() {
		bd = new BD();
	}
		
	public String gravar(Avaliacao a) {
		sql = "INSERT INTO AVALIACAO VALUES (?, ?)";
		men = "Avaliação inserida com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, a.getDataAvaliacao());
			bd.st.setString(2, a.getTipoAvaliacao());
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch(SQLException e) {
			sql = "UPDATE AVALIACAO SET data_avaliacao = ?, tipo_avaliacao = ? WHERE codigo_avaliacao = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, a.getDataAvaliacao());
				bd.st.setString(2, a.getTipoAvaliacao());
				bd.st.setInt(3, a.getCodigoAvaliacao());
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					men = "Avaliação alterada com sucesso!";
				} else {
					men = "Avaliação não encontrada!";
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
	
	public String excluir(Object codigoAvaliacao) {
		sql = "DELETE FROM AVALIACAO WHERE codigo_avaliacao = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setObject(1, codigoAvaliacao);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluídas: " + n);
			if (n == 1) {
				men = "Avaliação excluída com sucesso!";
			} else {
				men = "Avaliação não encontrada!";
			}
		} catch (SQLException e) {
			men = "Falha" + e;
		} finally {
			bd.close();
		}
		return men;
	}
}



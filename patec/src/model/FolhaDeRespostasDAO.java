package model;

import java.sql.SQLException;

import util.BD;

public class FolhaDeRespostasDAO {

	private BD bd;
	private String sql, men;

	public FolhaDeRespostasDAO() {
		bd = new BD();
	}

	public String gravar(FolhaDeRespostas f) {
		sql = "INSERT INTO FOLHA_DE_RESPOSTAS VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		men = "Folha de respostas gravada com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, Character.toString(f.getResposta1()));
			bd.st.setString(2, Character.toString(f.getResposta2()));
			bd.st.setString(3, Character.toString(f.getResposta3()));
			bd.st.setString(4, Character.toString(f.getResposta4()));
			bd.st.setString(5, Character.toString(f.getResposta5()));
			bd.st.setInt(6, f.getNota());
			bd.st.setInt(7, f.getCodigoGabarito());
			bd.st.setString(8, f.getRaAluno());
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

}

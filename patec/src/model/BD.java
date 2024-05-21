package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;

public class BD {

	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;

	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DATABASENAME = "patec";
	private final String URL = "jdbc:mysql://localhost:3306/" + DATABASENAME;
	private final String LOGIN = "root";
	private final String SENHA = "";

	/**
	 * Realiza a conexão com o banco de dados
	 * 
	 * @return - true em caso de sucesso, ou false caso contrário
	 */
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou!");
			return true;
		} catch (SQLException erro) {
			System.out.println("Falha na conexão! " + erro);
			return false;
		} catch (ClassNotFoundException erro) {
			System.out.println("Driver não encontrado!");
			return false;
		}

	}

	/**
	 * Encerra a conexão e libera os objetos utilizados
	 */
	public void close() {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}

		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
		}
		try {
			if (con != null) {
				con.close();
				System.out.println("Desconectou!");
			}
		} catch (SQLException e) {
		}

	}

	// Criado apenas para testes:
	
	/*
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(
					"SELECT ALUNO.ra, ALUNO.nome_aluno, FOLHA_DE_RESPOSTAS.nota, GABARITO_OFICIAL.codigo_disciplina FROM FOLHA_DE_RESPOSTAS\r\n"
							+ "JOIN ALUNO ON FOLHA_DE_RESPOSTAS.ra = ALUNO.ra\r\n"
							+ "JOIN GABARITO_OFICIAL ON FOLHA_DE_RESPOSTAS.codigo_gabarito = GABARITO_OFICIAL.cod_gabarito\r\n"
							+ "WHERE GABARITO_OFICIAL.codigo_disciplina = 'MET100';");
			ResultSet rs = bd.st.executeQuery();
			while (rs.next()) {
				String ra = rs.getString("ALUNO.ra");
				String nomeAluno = rs.getString("ALUNO.nome_aluno");
				String nota = rs.getString("FOLHA_DE_RESPOSTAS.nota");
				String codigoDisciplina = rs.getString("GABARITO_OFICIAL.codigo_disciplina");

				System.out.println(ra + " " + nomeAluno + " " + nota + " " + codigoDisciplina);
			}

			System.out.println("\n");

			bd.st = bd.con.prepareStatement(
					"SELECT GABARITO_OFICIAL.codigo_disciplina, FOLHA_DE_RESPOSTAS.nota FROM FOLHA_DE_RESPOSTAS\r\n"
							+ "JOIN GABARITO_OFICIAL ON FOLHA_DE_RESPOSTAS.codigo_gabarito = GABARITO_OFICIAL.cod_gabarito\r\n"
							+ "WHERE FOLHA_DE_RESPOSTAS.ra = '1050482313004';");

			rs = bd.st.executeQuery();
			while (rs.next()) {
				String codigoDisciplina = rs.getString("GABARITO_OFICIAL.codigo_disciplina");
				String nota = rs.getString("FOLHA_DE_RESPOSTAS.nota");

				System.out.println(codigoDisciplina + " " + nota);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		bd.close();
	}
	
	*/

}

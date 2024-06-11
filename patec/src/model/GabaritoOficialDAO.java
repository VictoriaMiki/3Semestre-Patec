package model;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import util.BD;

public class GabaritoOficialDAO {

	private BD bd;
	private String sql, men;

	public GabaritoOficialDAO() {
		bd = new BD();
	}

	/**
	 *  Registra os dados contidos na instância da classe <code>GabaritoOficial</code> no banco
	 * de dados.
	 * <p>
	 * Caso os dados não existam no banco de dados, será criado um novo registro
	 * contendo eles; Caso existam, os dados serão atualizados tendo como base o
	 * registro cujo identificador está contido no atributo <code>codigoGabarito</code>.
	 * @param g - a instância da classe <code>GabaritoOficial</code>.
	 * @return Uma <code>String</code> que informa se a operação de
	 *         inserção/alteração foi bem-sucedida ou não.
	 */
	public String gravar(GabaritoOficial g) {
		sql = "INSERT INTO GABARITO_OFICIAL VALUES (?, ?, ?)";
		men = "Gabarito gravado com sucesso!";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, g.getCodigoGabarito());
			bd.st.setString(2, Character.toString(g.getQuestao1()));
			bd.st.setString(3, Character.toString(g.getQuestao2()));
			bd.st.setString(4, Character.toString(g.getQuestao3()));
			bd.st.setString(5, Character.toString(g.getQuestao4()));
			bd.st.setString(6, Character.toString(g.getQuestao5()));
			int n = bd.st.executeUpdate();
			System.out.println("Linhas inseridas: " + n);
		} catch (SQLException e) {
			sql = "UPDATE GABARITO_OFICIAL SET QUESTAO1 = ?, QUESTAO2 = ?, QUESTAO3 = ?, QUESTAO4 = ?, QUESTAO5 = ? WHERE cod_gabarito = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, Character.toString(g.getQuestao1()));
				bd.st.setString(2, Character.toString(g.getQuestao2()));
				bd.st.setString(3, Character.toString(g.getQuestao3()));
				bd.st.setString(4, Character.toString(g.getQuestao4()));
				bd.st.setString(5, Character.toString(g.getQuestao5()));
				int n = bd.st.executeUpdate();
				System.out.println("Linhas alteradas: " + n);
				if (n == 1) {
					men = "Gabarito alterado com sucesso!";
				} else {
					men = "Gabarito não encontrada!";
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
	 * @param codGabarito
	 * @return
	 */
	public String excluir(Object codGabarito) {
		sql = "DELETE FROM GABARITO_OFICIAL WHERE cod_gabarito = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setObject(1, codGabarito);
			int n = bd.st.executeUpdate();
			System.out.println("Linhas excluídas: " + n);
			if (n == 1) {
				men = "Gabarito excluído com sucesso!";
			} else {
				men = "Gabarito não encontrado!";
			}
		} catch (SQLException e) {
			men = "Falha" + e;
		} finally {
			bd.close();
		}
		return men;
	}
	
	public GabaritoOficial getGabaritoParaCorrecao(int codGabarito) {
		sql = "SELECT * FROM GABARITO_OFICIAL WHERE cod_gabarito = ?";
		GabaritoOficial go = null;
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, codGabarito);
			bd.rs = bd.st.executeQuery();
			while (bd.rs.next()) {
				go = new GabaritoOficial();
				go.setCodigoGabarito(bd.rs.getInt("cod_gabarito"));
				go.setQuestao1(bd.rs.getString("questao_1").charAt(0));
				go.setQuestao2(bd.rs.getString("questao_2").charAt(0));
				go.setQuestao3(bd.rs.getString("questao_3").charAt(0));
				go.setQuestao4(bd.rs.getString("questao_4").charAt(0));
				go.setQuestao5(bd.rs.getString("questao_5").charAt(0));
				go.setCodigoDisciplina(bd.rs.getString("codigo_disciplina"));
				go.setCodigoAvaliacao(bd.rs.getInt("codigo_avaliacao"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			bd.close();
		}
		return go;
	}

}

package model;

import java.sql.SQLException;

import util.BD;

public class GabaritoOficialDAO {

	private BD bd;
	private String sql;

	public GabaritoOficialDAO() {
		bd = new BD();
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

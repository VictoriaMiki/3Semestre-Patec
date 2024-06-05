package model;

public class Avaliacao {

	private int codigoAvaliacao;
	//private int anoAvaliacao;
	//private int semestreAvaliacao;
	private String dataAvaliacao;
	private String tipoAvaliacao;

	public Avaliacao() {
	}

	public Avaliacao(int codigoAvaliacao, String dataAvaliacao, String tipoAvaliacao) {
		super();
		this.codigoAvaliacao = codigoAvaliacao;
		this.dataAvaliacao = dataAvaliacao;
		this.tipoAvaliacao = tipoAvaliacao;
	}

	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	public String getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(String dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public String getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	public void setTipoAvaliacao(String tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}
}

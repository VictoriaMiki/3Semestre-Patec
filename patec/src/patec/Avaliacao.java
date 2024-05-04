package patec;

public class Avaliacao {

	private int codigoAvaliacao;
	private int anoAvaliacao;
	private int semestreAvaliacao;
	private String tipoAvaliacao;
	
	public Avaliacao(int codigoAvaliacao, int anoAvaliacao, int semestreAvaliacao, String tipoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
		this.anoAvaliacao = anoAvaliacao;
		this.semestreAvaliacao = semestreAvaliacao;
		this.tipoAvaliacao = tipoAvaliacao;
	}
	
	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}
	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}
	public int getAnoAvaliacao() {
		return anoAvaliacao;
	}
	public void setAnoAvaliacao(int anoAvaliacao) {
		this.anoAvaliacao = anoAvaliacao;
	}
	public int getSemestreAvaliacao() {
		return semestreAvaliacao;
	}
	public void setSemestreAvaliacao(int semestreAvaliacao) {
		this.semestreAvaliacao = semestreAvaliacao;
	}
	public String getTipoAvaliacao() {
		return tipoAvaliacao;
	}
	public void setTipoAvaliacao(String tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}
}

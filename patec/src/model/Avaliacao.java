package model;

public class Avaliacao {

	private int codigoAvaliacao;
	// private int anoAvaliacao;
	// private int semestreAvaliacao;
	private String dataAvaliacao;
	private String tipoAvaliacao;

	/**
	 * Cria uma nova instância de <code>Avaliacao</code>, sem nenhum valor inicial
	 * atribuído aos atributos da instância.
	 */
	public Avaliacao() {
	}

	/**
	 * Cria uma nova instância de <code>Avaliacao</code>, com os valores iniciais
	 * atribuídos aos atributos da instância.
	 * 
	 * @param codigoAvaliacao
	 * @param dataAvaliacao
	 * @param tipoAvaliacao
	 */
	public Avaliacao(int codigoAvaliacao, String dataAvaliacao, String tipoAvaliacao) {
		super();
		this.codigoAvaliacao = codigoAvaliacao;
		this.dataAvaliacao = dataAvaliacao;
		this.tipoAvaliacao = tipoAvaliacao;
	}

	/**
	 * Recupera o valor atribuído ao atributo <code>codigoAvaliacao</code>.
	 * 
	 * @return
	 */
	public int getCodigoAvaliacao() {
		return codigoAvaliacao;
	}

	/**
	 * Define o valor do atributo <code>codigoAvaliacao</code>.
	 * 
	 * @param codigoAvaliacao
	 */
	public void setCodigoAvaliacao(int codigoAvaliacao) {
		this.codigoAvaliacao = codigoAvaliacao;
	}

	/**
	 * Recupera o valor atribuído ao atributo <code>dataAvaliacao</code>.
	 * 
	 * @return
	 */
	public String getDataAvaliacao() {
		return dataAvaliacao;
	}

	/**
	 * Define o valor do atributo <code>dataAvaliacao</code>.
	 * 
	 * @param dataAvaliacao
	 */
	public void setDataAvaliacao(String dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	/**
	 * Recupera o valor atribuído ao atributo <code>tipoAvaliacao</code>.
	 * 
	 * @return
	 */
	public String getTipoAvaliacao() {
		return tipoAvaliacao;
	}

	/**
	 * Define o valor do atributo <code>tipoAvaliacao</code>.
	 * 
	 * @param tipoAvaliacao
	 */
	public void setTipoAvaliacao(String tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}
}

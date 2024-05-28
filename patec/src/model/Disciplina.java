package model;

public class Disciplina {

	private String codigoDisciplina;
	private String nomeDisciplina;
	private int semestreDisciplina;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public Disciplina(String codigoDisciplina, String nomeDisciplina, int semestreDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.semestreDisciplina = semestreDisciplina;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getSemestreDisciplina() {
		return semestreDisciplina;
	}

	public void setSemestreDisciplina(int semestreDisciplina) {
		this.semestreDisciplina = semestreDisciplina;
	}
}

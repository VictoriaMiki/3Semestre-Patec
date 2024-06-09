package model;

public class AlunoDisciplina {

	private String codigoDisciplina;
	private String ra;
	
	public AlunoDisciplina() {
	}

	public AlunoDisciplina(String codigoDisciplina, String ra) {
		this.codigoDisciplina = codigoDisciplina;
		this.ra = ra;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
		
}

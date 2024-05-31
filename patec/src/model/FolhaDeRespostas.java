package model;

public class FolhaDeRespostas {
	private int codigoRespostas;
	private char resposta1;
	private char resposta2;
	private char resposta3;
	private char resposta4;
	private char resposta5;
	private int nota;

	private int codigoGabarito;
	private String raAluno;

	public FolhaDeRespostas() {
	};

	public FolhaDeRespostas(int codigoRespostas, char resposta1, char resposta2, char resposta3, char resposta4,
			char resposta5, int nota, int codigoGabarito, String raAluno) {
		this.codigoRespostas = codigoRespostas;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.resposta5 = resposta5;
		this.nota = nota;
		this.codigoGabarito = codigoGabarito;
		this.raAluno = raAluno;
	}

	public int getCodigoRespostas() {
		return codigoRespostas;
	}

	public void setCodigoRespostas(int codigoRespostas) {
		this.codigoRespostas = codigoRespostas;
	}

	public char getResposta1() {
		return resposta1;
	}

	public void setResposta1(char resposta1) {
		this.resposta1 = resposta1;
	}

	public char getResposta2() {
		return resposta2;
	}

	public void setResposta2(char resposta2) {
		this.resposta2 = resposta2;
	}

	public char getResposta3() {
		return resposta3;
	}

	public void setResposta3(char resposta3) {
		this.resposta3 = resposta3;
	}

	public char getResposta4() {
		return resposta4;
	}

	public void setResposta4(char resposta4) {
		this.resposta4 = resposta4;
	}

	public char getResposta5() {
		return resposta5;
	}

	public void setResposta5(char resposta5) {
		this.resposta5 = resposta5;
	}
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getCodigoGabarito() {
		return codigoGabarito;
	}

	public void setCodigoGabarito(int codigoGabarito) {
		this.codigoGabarito = codigoGabarito;
	}

	public String getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(String raAluno) {
		this.raAluno = raAluno;
	}
}

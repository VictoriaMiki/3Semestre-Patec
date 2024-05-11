package model;

import java.sql.Date;

public class Aluno {
	
	private String ra;
	private String cpf;
	private String nomeAluno;
	
	public Aluno(String ra, String cpf, String nomeAluno, Date dataNascimento) {
		this.ra = ra;
		this.cpf = cpf;
		this.nomeAluno = nomeAluno;
		this.dataNascimento = dataNascimento;
	}
	private Date dataNascimento;
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

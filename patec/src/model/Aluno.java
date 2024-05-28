package model;

import java.sql.Date;

public class Aluno {

	private String ra;
	private String cpf;
	private String nomeAluno;
	private String dataNascimento;

	public Aluno() {
	}

	public Aluno(String ra, String cpf, String nomeAluno, String dataNascimento) {
		this.ra = ra;
		this.cpf = cpf;
		this.nomeAluno = nomeAluno;
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Recupera o valor atribuído ao atributo {@code ra}.
	 * @return O valor do atributo {@code ra}.
	 */
	public String getRa() {
		return ra;
	}

	/**
	 * Define o valor do atributo {@code ra}.
	 * @param ra
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}

	/**
	 * Recupera o valor atribuído ao atributo {@code cpf}.
	 * @return O valor do atributo {@code cpf}.
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Define o valor do atributo {@code cpf}.
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Recupera o valor atribuído ao atributo {@code nomeAluno}.
	 * @return O valor do atributo {@code nomeAluno}.
	 */
	public String getNomeAluno() {
		return nomeAluno;
	}

	/**
	 * Define o valor do atributo {@code nomeAluno}.
	 * @param nomeAluno
	 */
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	/**
	 * Recupera o valor atribuído ao atributo {@code dataNascimento}.
	 * @return O valor do atributo {@code dataNascimento}.
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Define o valor do atributo {@code dataNascimento}.
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

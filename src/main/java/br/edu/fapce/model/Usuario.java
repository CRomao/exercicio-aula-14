package br.edu.fapce.model;

import java.io.Serializable;

public class Usuario implements Serializable{

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String nomeMae;

	public Usuario(String nome, String cpf, String dataNascimento, String nomeMae) {
		setNome(nome);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setNomeMae(nomeMae);
	}
	
	public void imprimirDados() {
		System.out.print("Nome: " + getNome());
		System.out.print(" | CPF: " + getCpf());
		System.out.print(" | Data Nascimento: " + getDataNascimento());
		System.out.println(" | Nome Mãe: " + getNomeMae());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}


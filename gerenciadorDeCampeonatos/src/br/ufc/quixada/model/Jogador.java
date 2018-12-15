package br.ufc.quixada.model;

public class Jogador {
	// ATRIBUTOS
	
	private String nome;
	private String cpf;
	
	// MÉTODOS
	
	public Jogador(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Jogador() {
		super();
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
	
}

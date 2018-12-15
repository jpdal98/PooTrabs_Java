package br.ufc.quixada.es.model;

public class Pessoa {
	// ATRIBUTOS
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	
	// METODOS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + ",\nEndereco: " + endereco + ",\nTelefone: " + telefone;
	}
	
	
}

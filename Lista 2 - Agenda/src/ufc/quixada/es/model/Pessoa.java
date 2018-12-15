package ufc.quixada.es.model;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;

	public Pessoa() {}
	
	public Pessoa(String nome, String endereco, String email) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

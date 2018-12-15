package br.ufc.quixada.model;

public class Cliente {
	// ATRIBUTOS
	private String nome;
	private String cpf;
	
	// MÉTODOS
	
	public float darNotaAoMotorista(Motorista motorista) {
		motorista.setNota((float) 7.3);
		return motorista.getNota();
	}
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
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

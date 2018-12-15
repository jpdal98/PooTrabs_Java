package br.ufc.quixada.model;

public class Motorista {
	// ATRIBUTOS
	
	private String nome;
	private String cnh;
	private String placa;
	private float nota;
	
	// MÉTODOS
	
	public void realizarCorrida(Cliente cliente, Corrida corrida) {
		System.out.println("Cliente: "+cliente.getNome()+"\nMotorista: "+ this.getNome()+
				"\nNota: "+this.getNota()+"\nPartida: "+corrida.getPartida()+"\nDestino: "+
				corrida.getDestino());
	}
	
	public Motorista() {
		super();
	}

	public Motorista(String nome, String cnh, String placa, float nota) {
		super();
		this.nome = nome;
		this.cnh = cnh;
		this.placa = placa;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String toString() {
		return "Motorista [nome=" + nome + ", cnh=" + cnh + ", placa=" + placa + ", nota=" + nota + "]";
	}
	
	
}

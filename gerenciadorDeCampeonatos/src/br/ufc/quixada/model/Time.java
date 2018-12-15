package br.ufc.quixada.model;

public class Time {
	// ATRIBUTOS
	
	private String nome;
	private Jogador vetor[] = new Jogador[12];
	private int contador = 0;
	
	//MÉTODOS
	
	public void adicionarJogadorAoTime(Jogador j) {
		this.vetor[this.contador] = j;
	}

	public Time(String nome, Jogador[] vetor, int contador) {
		super();
		this.nome = nome;
		this.vetor = vetor;
		this.contador = contador;
	}

	public Time() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getVetor() {
		return vetor;
	}

	public void setVetor(Jogador[] vetor) {
		this.vetor = vetor;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
}

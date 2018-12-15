package br.ufc.quixada.model;

public class Partida {
	// ATRIBUTOS
	
	private int id;
	
	// METÓDOS
	
	public Partida() {
		super();
	}
	
	public void gerarResultado(Time a, Time b) {
		System.out.println(a.getNome() + " 1 x 1 " + b.getNome());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

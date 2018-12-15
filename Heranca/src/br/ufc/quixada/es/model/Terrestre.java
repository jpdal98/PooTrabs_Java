package br.ufc.quixada.es.model;

public class Terrestre extends Transporte{
	
	private int numDeRodas;	
	
	public Terrestre() {
		super();
	}
	
	public Terrestre(int capacidade, int numDeRodas) {
		super(capacidade);
		this.numDeRodas = numDeRodas;
	}
	
	public int getNumDeRodas() {
		return numDeRodas;
	}

	public void setNumDeRodas(int numDeRodas) {
		this.numDeRodas = numDeRodas;
	}
	
	
	
}

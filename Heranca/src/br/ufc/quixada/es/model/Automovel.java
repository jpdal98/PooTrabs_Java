package br.ufc.quixada.es.model;

public class Automovel extends Terrestre{
	
	private String cor;
	private int numDePortas;
	private String placa;
	
	
	public Automovel() {
		super();
	}
	
	public Automovel(int capacidade, int numDeRodas, String cor, int numDePortas, String placa) {
		super(capacidade, numDeRodas);
		this.cor = cor;
		this.numDePortas = numDePortas;
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumDePortas() {
		return numDePortas;
	}
	public void setNumDePortas(int numDePortas) {
		this.numDePortas = numDePortas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	

	

}

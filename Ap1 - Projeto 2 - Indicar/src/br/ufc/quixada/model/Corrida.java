package br.ufc.quixada.model;

public class Corrida {
	// ATRIBUTOS
	
	private String partida;
	private String destino;
	private float precoKm;
	private float precoCorrida;
	
	// MÉTODOS
	
	public float calcularValorCorrida(int distancia) {
		this.setPrecoCorrida((distancia*this.precoKm)+5);
		return this.getPrecoCorrida();
	}

	public Corrida() {
		super();
	}

	public Corrida(String partida, String destino, float precoKm, float precoCorrida) {
		super();
		this.partida = partida;
		this.destino = destino;
		this.precoKm = precoKm;
		this.precoCorrida = precoCorrida;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPrecoKm() {
		return precoKm;
	}

	public void setPrecoKm(float precoKm) {
		this.precoKm = precoKm;
	}

	public float getPrecoCorrida() {
		return precoCorrida;
	}

	public void setPrecoCorrida(float precoCorrida) {
		this.precoCorrida = precoCorrida;
	}

	public String toString() {
		return "Corrida [partida=" + partida + ", destino=" + destino + ", precoKm=" + precoKm + ", precoCorrida="
				+ precoCorrida + "]";
	}
	
}

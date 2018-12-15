package br.ufc.quixada.es.model;

public class Fornecedor extends Pessoa{
	// ATRIBUTOS
	
	private float valorCredito;
	private float valorDivida;
	
	
	// METODOS
	
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor() {
		super();
	}
	
	public float obterSaldo () {
		return this.valorCredito - this.valorDivida;
	}
	
}

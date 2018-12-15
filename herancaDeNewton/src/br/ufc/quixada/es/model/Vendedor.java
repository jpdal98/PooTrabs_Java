package br.ufc.quixada.es.model;

public class Vendedor extends Empregado{
	// ATRIBUTOS
	
	private float valorVenda;
	private float comissao;
	
	// MÉTODOS
	
	public float calcularSalario() {
		return super.calcularSalario() + (this.valorVenda*comissao);
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto,
			float valorVenda, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}
	
	public Vendedor() {
		super();
	}
}

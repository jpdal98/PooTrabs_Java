package br.ufc.quixada.es.model;

public class Adiministrador extends Empregado {
	// ATRIBUTOS
	
	private float ajudaDeCusto;
	
	// METODOS
	
	
	public float calcularSalario() {
		return super.calcularSalario() + this.ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Adiministrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase,
			float imposto, float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public Adiministrador() {
		super();
	}
	
}

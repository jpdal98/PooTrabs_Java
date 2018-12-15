package ufc.quixada.es.model;

public class Quadrado extends Figura{
	
	private double lado;
	
	public Quadrado() {}

	public Quadrado(String cor, boolean filled, double lado) {
		super(cor, filled);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return 4*lado;
	}
}

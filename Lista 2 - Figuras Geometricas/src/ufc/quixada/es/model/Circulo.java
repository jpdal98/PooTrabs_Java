package ufc.quixada.es.model;

public class Circulo extends Figura{
	private double raio;
	
	public Circulo() {}
	
	public Circulo(String cor, boolean filled, double raio) {
		super(cor, filled);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return 3.14*(raio*raio);
	}
	
	public double perimetro() {
		return (2*3.14)*raio;
	}
	
}

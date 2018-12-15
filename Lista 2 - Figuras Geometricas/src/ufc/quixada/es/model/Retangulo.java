package ufc.quixada.es.model;

public class Retangulo extends Figura{
	
	private double ladoA;
	private double ladoB;
	
	public Retangulo() {}

	public Retangulo(String cor, boolean filled, double ladoA, double ladoB) {
		super(cor, filled);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double area() {
		return ladoA*ladoB/2;
	}
	
	public double perimetro() {
		return 2*(ladoA + ladoB);
	}
}

package ufc.quixada.es.model;

public abstract class Figura {
	private String cor;
	private boolean filled;
	
	public Figura() {}
	
	public Figura(String cor, boolean filled) {
		this.cor = cor;
		this.filled = filled;
	}
	
	
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void preenchido() {
		if(this.isFilled()) {
			System.out.println("A cor da figura é: " + this.getCor()+".");
		}
		else {
			System.out.println("A cor da figura é vazia.");
		}
	}
}

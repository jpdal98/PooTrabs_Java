package ufc.quixada.es.model;

public abstract class Pessoa {
	
	private String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa de:"
				+ "\nNome: "+nome+".";
	}

}

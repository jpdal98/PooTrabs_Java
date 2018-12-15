
public class Servico {

	private String idservico;
	private float preco;
	
	public Servico(String idservico, float preco) {
		this.idservico = idservico;
		this.preco = preco;
	}

	public String getIdservico() {
		return idservico;
	}

	public void setIdservico(String idservico) {
		this.idservico = idservico;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "" + idservico + ":" + preco;
	}
	
}


public class Vendas {

	private String idcliente;
	private String idanimal;
	private String idservico;
	
	public Vendas(String idcliente, String idanimal, String idservico) {
		this.idcliente = idcliente;
		this.idanimal = idanimal;
		this.idservico = idservico;
	}

	public String getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public String getIdanimal() {
		return idanimal;
	}

	public void setIdanimal(String idanimal) {
		this.idanimal = idanimal;
	}

	public String getIdservico() {
		return idservico;
	}

	public void setIdservico(String idservico) {
		this.idservico = idservico;
	}
	
	public String toString() {
		return "" + idcliente + ":" + idanimal + ":" + idservico;
	}
	
}


public class Cliente implements Comparable<Cliente> {

	private String idcliente;
	private String password;
	Repositorio<Conta> contas;
	static int numero = 1;
	
	public Cliente(String idcliente, String password) {
		this.idcliente = idcliente;
		this.password = password;
		this.contas = new Repositorio<Conta>("contas");
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean matchPassword(String password) {
		return this.password.equals(password);
	}
	
	public String getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public Repositorio<Conta> getContas() {
		return contas;
	}

	public String toString() {
		return " Cliente:" + idcliente;
	}

	public void addConta() {
		this.contas.add("numero" ,new Conta(numero));
	}
	
	public int compareTo(Cliente other) {
		
		return this.idcliente.compareTo(other.idcliente);
	}
	
}

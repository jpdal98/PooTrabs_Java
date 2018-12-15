

class Cliente {

	public String clienteid;
	public String nome;
	public String estado = "vivo";
	public float saldo = 0;
	
	public Cliente(String clienteid, String nome) {
		this.clienteid = clienteid;
		this.nome =  nome;
		//this.saldo = saldo;
	}
	
	public String toString() {
		return " "+nome +":"+ clienteid+ ":" +estado + "\n";
	}
	
	public String mostrarSaldoClientes() {
		return " nome:" + nome +" saldo : " + saldo + "\n";
	}

	
}

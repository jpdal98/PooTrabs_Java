
public class Divida {

	public String nome;
	public float valor_divida;
	public int id = 0;
	public float valor_total = 0;
	
	public Divida(String nome, float valor, int id) {
		this.nome = nome;
		this.valor_divida = valor;
		this.id = id;
		this.valor_total = valor_divida + valor_total;
	}
	
	public String toString() {
		return  " id:" + id + " nome:" + nome + " valor:" + valor_divida +"\n";
	}
	
	/*public String mostrar() {
        return " nome:" + nome + " saldo: "+ valor_total+ "\n";
	}*/

}


public class Operaco {

	private String descricao;
	private float valor;
	private float saldoparcial = 0;
	
	public Operaco(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
		this.saldoparcial += valor;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getSaldoparcial() {
		return saldoparcial;
	}
	public void setSaldoparcial(float saldoparcial) {
		this.saldoparcial = saldoparcial;
	}
	
	public String toString() {
		return "" + descricao + " " + valor + " " + saldoparcial;
	}
	
}

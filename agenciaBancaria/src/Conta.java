
public class Conta {

	private float saldo;
	private int numero;
	private Repositorio<Operaco> extrato;
	private boolean ativa;
	int auxcontadorextrato;
	
	public Conta(int numero) {
		this.numero = numero;
		this.saldo += saldo;
		this.extrato = new Repositorio<Operaco>(null);
		this.ativa =  true;
	}

	public float getSaldo() {
		return saldo;
	}

	public float setSaldo(float saldo) {
		return this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public Repositorio<Operaco> getExtrato() {
		return extrato;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public void sacar(float value) {
		if(ativa) {
		     if(value < 0 && value > saldo)
			     throw new RuntimeException("fail: valor " + value + " menor que 0" );
		     this.setSaldo(saldo -= value);
		     this.extrato.add( "" + auxcontadorextrato , new Operaco("sacar", value) );
		     auxcontadorextrato++;
		     return;
		}
		throw new RuntimeException("fail: Conta não ativa");
	}
	
	public void depositar(float value) {
		if (ativa) {
			if (value < 0)
				throw new RuntimeException("fail: valor " + value + "menor que  0");
			this.extrato.add("" + auxcontadorextrato, new Operaco("depositar", value));
			this.saldo += value;
			auxcontadorextrato++;
		    return;
		}
		throw new RuntimeException("fail: Conta não ativa");
	}
	
	public void transferir(float value, Conta other) {
		if (this.ativa) {
			if (value < 0)
				throw new RuntimeException("fail: valor" + value + "menor que 0");
			this.extrato.add("" + auxcontadorextrato, new Operaco("transferencia", value));
			this.saldo -= value;
			other.saldo += value;
			auxcontadorextrato++;
			return;
		}
		throw new RuntimeException("fail: Conta não ativa");
	}
	
	public void encerrar() {
		this.ativa = false;
	}
	
}

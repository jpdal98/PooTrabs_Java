package ufc.quixada.es.model;

public class Analista extends Funcionario{
	
	public Analista() {
		super();
	}

	public Analista(String nome, String cpf, String matricula, float salario) {
		super(nome, cpf, matricula, salario);
	}
	
	public void processarContrato(Operadora op, Contrato c) {
		op.cadastrarContratoCliente(c);
		this.darBonificacao();
	}
	
	public void darBonificacao() {
		float novoSalario = this.getSalario() + (this.getSalario()*0.02f);
		this.setSalario(novoSalario);
	}
	
	@Override
	public String toString() {
		return "Funcion�rio vendedor de :"
				+ "\nCPF: " + getCpf() + "\nMatr�cula: " + getMatricula() + "\nSal�rio: " + getSalario() + "\nNome: "
				+ getNome() +".";
	}
	

}

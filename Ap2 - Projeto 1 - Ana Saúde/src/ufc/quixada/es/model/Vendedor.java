package ufc.quixada.es.model;

public class Vendedor extends Funcionario{
	
	public Vendedor(){
		super();
	}
	
	public Vendedor(String nome, String cpf, String matricula, float salario) {
		super(nome, cpf, matricula, salario);
	}

	public void realizarVenda(float valorContrato) {
		float novoSalario = this.getSalario() + (valorContrato*0.5f);
		this.setSalario(novoSalario);
		darBonificacao();
	}
	
	public void darBonificacao() {
		float novoSalario = this.getSalario() + (this.getSalario() * 0.05f);
		this.setSalario(novoSalario);
	}
	
	@Override
	public String toString() {
		return "Funcionário vendedor de :"
				+ "\nCPF: " + getCpf() + "\nMatrícula: " + getMatricula() + "\nSalário: " + getSalario() + "\nNome: "
				+ getNome() +".";
	}
	
}

package ufc.quixada.es.model;

public class ServicosGerais extends Funcionario{
	
	public ServicosGerais() {
		super();
	}

	public ServicosGerais(String nome, String cpf, String matricula, float salario) {
		super(nome, cpf, matricula, salario);
	}
	
	public void limpar() {
		this.darBonificacao();
	}
	
	public void darBonificacao() {
		float novoSalario = this.getSalario()+3;
		this.setSalario(novoSalario);
	}
	@Override
	public String toString() {
		return "Funcionario de serviços gerais de :"
				+ "\nCPF: " + getCpf() + "\nMatrícula: " + getMatricula() + "\nSalário: " + getSalario() + "\nNome: "
				+ getNome() +".";
	}
	

}

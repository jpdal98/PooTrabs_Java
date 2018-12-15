package ufc.quixada.es.model;

public class Fisica extends Pessoa {
	private String cpf;
	private String dataNasc;
	private String estadoCivil;
	
	public Fisica() {
		super();
	}

	public Fisica(String nome, String endereco, String email, String cpf, String dataNasc, String estadoCivil) {
		super(nome, endereco, email);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}

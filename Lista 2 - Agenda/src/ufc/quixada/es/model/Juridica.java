package ufc.quixada.es.model;

public class Juridica extends Pessoa{
	private String cnpj;
	private String inscEstadual;
	private String razaoSocial;
	
	public Juridica() {
		super();
	}

	public Juridica(String nome, String endereco, String email, String cnpj, String inscEstadual, String razaoSocial) {
		super(nome, endereco, email);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	
}

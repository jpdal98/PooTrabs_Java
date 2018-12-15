package ufc.quixada.es.model;

import java.time.LocalDate;

public class ClientePessoaJuridica extends Cliente{
	
	private String cnpj;
	private LocalDate dataAbertura;
	
	public ClientePessoaJuridica() {
		super();
	}

	public ClientePessoaJuridica(String nome, String endereco, String cnpj, LocalDate dataAbertura) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public String toString() {
		return "Cliente Pessoa Juridica de : "
				+ "\nCNPJ: " + cnpj + "\nData de abertura: " + dataAbertura + "\nEndereço: "
				+ getEndereco() + "\nNome: " + getNome()+".";
	}
	
	

}

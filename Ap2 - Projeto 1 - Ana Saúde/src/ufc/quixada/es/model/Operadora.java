package ufc.quixada.es.model;

import java.util.ArrayList;
import java.util.List;

public class Operadora implements Imprimivel{
	
	private int codOperadora;
	private String nome;
	private List<Contrato> contratos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	
	public Operadora() {
		super();
	}
	public Operadora(int codOperadora, String nome, List<Contrato> contratos, List<Cliente> clientes) {
		super();
		this.codOperadora = codOperadora;
		this.nome = nome;
		this.contratos = contratos;
		this.clientes = clientes;
	}
	
	public void cadastrarContratoCliente(Contrato c) {
		this.clientes.add(c.getCliente());
		this.contratos.add(c);
	}
	public int getCodOperadora() {
		return codOperadora;
	}
	public void setCodOperadora(int codOperadora) {
		this.codOperadora = codOperadora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Contrato> getContratos() {
		return contratos;
	}
	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	@Override
	public String toString() {
		return "Operadora de : "
				+ "\nCódigo: " + codOperadora + "\nNome: " + nome + "\nContratos " + contratos 
				+ "\nClientes: "+ clientes + ".";
	}
	
	@Override
	public void mostrarContratos() {
		for (Contrato contrato : contratos) {
			System.out.println(contrato);
		}
	}
	
	
}

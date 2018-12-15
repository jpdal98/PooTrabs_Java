package ufc.quixada.es.exec;

import java.time.LocalDate;

import ufc.quixada.es.model.Analista;
import ufc.quixada.es.model.ClientePessoaFisica;
import ufc.quixada.es.model.ClientePessoaJuridica;
import ufc.quixada.es.model.Contrato;
import ufc.quixada.es.model.Operadora;
import ufc.quixada.es.model.Vendedor;

public class PrincipalImprimivel {

	public static void main(String[] args) {
		
		ClientePessoaJuridica cli1 = new ClientePessoaJuridica("Ari","Bairro C Rua K 23", "111222333442", LocalDate.of(2018, 05, 14));
		ClientePessoaFisica cli2 = new ClientePessoaFisica("Marli", "Bairro T Rua C 76", "55566677788",LocalDate.of(2018, 11, 20));
		ClientePessoaFisica cli3 = new ClientePessoaFisica("Jandí", "Bairro F Rua S 2298", "99900011122", LocalDate.of(2018, 11, 30));
		
		Vendedor v1 = new Vendedor("Rosa", "12345678900", "998212", 300.00f);
		Vendedor v2 = new Vendedor("Pedro", "98765432100", "985612", 500.00f);
		Vendedor v3 = new Vendedor("Carlos", "56709812310", "006512", 400.00f);
		
		Operadora op = new Operadora();
		Contrato c1 = new Contrato(1921, cli1, v1, LocalDate.of(2018, 11, 28), 450.00f);
		Contrato c2 = new Contrato(1922, cli3, v2, LocalDate.of(2018, 11, 24), 500.00f);
		Contrato c3 = new Contrato(1923, cli2, v3, LocalDate.of(2018, 11, 28), 1000.00f);
		Analista ana = new Analista("Ana", "Bairro P Rua M 90", "90980870711", 1200.00f);
		
		op.setNome("Curar");
		op.setCodOperadora(3902);
		ana.processarContrato(op, c1);
		ana.processarContrato(op, c2);
		ana.processarContrato(op, c3);
		
		System.out.println(op);
		System.out.println("+++----------------------------------------------------------------------------+++");
		op.mostrarContratos();
		
		
		
	}
}

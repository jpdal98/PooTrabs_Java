package br.ufc.quixada.es.exec;

import br.ufc.quixada.es.model.Adiministrador;
import br.ufc.quixada.es.model.Empregado;
import br.ufc.quixada.es.model.Fornecedor;
import br.ufc.quixada.es.model.Operario;
import br.ufc.quixada.es.model.Pessoa;
import br.ufc.quixada.es.model.Vendedor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Anaximandro", "Rua X", "96666-6666");
		System.out.println("Nome da pessoa: " + p.getNome());
		
		Fornecedor f = new Fornecedor("Dario", "Rua T", "98899-1122", 10000, 1235.54f);
		System.out.println("Valor do saldo do fornecedor(a) " + f.getNome() + " é: "+ f.obterSaldo());
		
		Empregado m = new Empregado("Rosana", "Rua A","99765-4308", 88, 2300, 0.4f);
		System.out.println("O valor do salário do empregado(a) "+ m.getNome() + " com o código " + m.getCodigoSetor()+" "
				+ " é: " + m.calcularSalario());
		
		Adiministrador a = new Adiministrador("Carla","Rua C", "99954-3108", 72, 1500, 0.4f, 2000);
		System.out.println("O valor do salário do adiministrador(a) "+a.getNome()+" com o código "+a.getCodigoSetor()
		+ " é: "+ a.calcularSalario());
		
		Operario o = new Operario("Lorenzo","Rua K", "98388-1214", 34, 1400, 0.4f, 1300, 0.7f);
		System.out.println("O valor do salário do operario(a) "+o.getNome()+" com o código "+o.getCodigoSetor()
		+ " é: "+ o.calcularSalario());
		
		Vendedor v = new Vendedor("Geberson", "Rua P", "99587-0002", 69, 1300, 0.4f, 1000, 0.8f);
		System.out.println("O valor do salário do vendedor(a) "+v.getNome()+" com o código "+v.getCodigoSetor()
		+ " é: "+ v.calcularSalario());
	}

}

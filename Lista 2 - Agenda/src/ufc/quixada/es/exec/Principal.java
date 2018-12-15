package ufc.quixada.es.exec;

import ufc.quixada.es.model.Agenda;
import ufc.quixada.es.model.Fisica;
import ufc.quixada.es.model.Juridica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fisica f = new Fisica("Diego", "rua O", "dot@.com", "111.111.111-11", "11/12/99","solteiro");
		Fisica f2 = new Fisica("Roberto", "rua B", "rot@.com", "222.222.222-22", "22/09/93","casado");
		Juridica j = new Juridica("Domingos", "rua D", "doot@.com", "11.111.111/1111-11", "111.221.21","ajudar");
		Juridica j2 = new Juridica("Carlos", "rua V", "cot@.com", "22.222.222/2222-22", "111.221.11","ajudar");
		
		Agenda a = new Agenda();
		
		System.out.println("Contatos adicionados: ");
		a.adicionarContato(f2);
		a.adicionarContato(j2);
		a.adicionarContato(j);
		a.adicionarContato(f);
		a.visualizarContatos();
		
		System.out.println("Busca de dois contatos: ");
		System.out.println(a.pesquisaCpf("111.111.111-11").getNome());
		System.out.println(a.pesquisaCnpj("22.222.222/2222-22").getNome());
		
		System.out.println("Agenda ordenada: ");
		a.ordenarContatos();
		a.visualizarContatos();
		System.out.println("Um contato removido: ");
		a.removeContatoF("222.222.222-22");
		a.visualizarContatos();
	}

}

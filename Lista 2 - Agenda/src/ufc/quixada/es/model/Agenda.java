package ufc.quixada.es.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List <Pessoa> listaDeContatos = new ArrayList<>();
	
	public void adicionarContato (Pessoa contato) {
		listaDeContatos.add(contato);
	}
	
	public Fisica pesquisaCpf(String cpf) {
		for (int j = 0; j < listaDeContatos.size(); j++) {
			if(listaDeContatos.get(j) instanceof Fisica) {
				Fisica aux = (Fisica) listaDeContatos.get(j);
				if( aux.getCpf().equals(cpf)){
					return aux;
				}
			}
		}
		return null;
	}
	
	public Juridica pesquisaCnpj(String cnpj) {
		for (int j = 0; j < listaDeContatos.size(); j++) {
			if(listaDeContatos.get(j) instanceof Juridica) {	
				Juridica aux = (Juridica) listaDeContatos.get(j);
				if(aux.getCnpj().equals(cnpj)){
					return aux;
				}
			}
		}
		return null;
	}
	
	public void removeContatoF(String cpf) {
		Fisica contatoF = pesquisaCpf(cpf);
		int ind = listaDeContatos.indexOf(contatoF);
		listaDeContatos.remove(ind);
	}
	public void removeContatoJ(String cnpj) {
		Juridica contatoJ = pesquisaCnpj(cnpj);
		int ind = listaDeContatos.indexOf(contatoJ);
		listaDeContatos.remove(ind);
	}
	
	public void visualizarContatos() {
		for (int i = 0; i < listaDeContatos.size(); i++) {
			System.out.println("Nome: " + listaDeContatos.get(i).getNome() + " E-mail: " + listaDeContatos.get(i).getEmail());
		}
	}
	
	public void ordenarContatos() {
		
		List <Fisica> pessoasFisicas = new ArrayList <Fisica>();
		List <Juridica> pessoasJuridicas = new ArrayList <Juridica>();
		
		for(int i = 0; i < listaDeContatos.size(); i++) {
			if(listaDeContatos.get(i) instanceof Fisica) {
				pessoasFisicas.add((Fisica)listaDeContatos.get(i));
			}
			else {
				pessoasJuridicas.add((Juridica)listaDeContatos.get(i));
			}
		}
		
		for(int i = 0; i < pessoasFisicas.size(); i++) {
			Fisica auxA = pessoasFisicas.get(i);
			for(int j = i+1; j < pessoasFisicas.size(); j++) {
				Fisica auxB = pessoasFisicas.get(j);
				int resp = auxA.getCpf().compareTo(auxB.getCpf());
				if(resp > 0) {
					pessoasFisicas.set(j, auxA);
					pessoasFisicas.set(i, auxB);
				}
			}
		}
		
		for(int i = 0; i < pessoasJuridicas.size(); i++) {
			Juridica auxA = pessoasJuridicas.get(i);
			for(int j = i+1; j < pessoasJuridicas.size(); j++) {
				Juridica auxB = pessoasJuridicas.get(j);
				int resp = auxA.getCnpj().compareTo(auxB.getCnpj());
				if(resp > 0) {
					pessoasJuridicas.set(j, auxA);
					pessoasJuridicas.set(i, auxB);
				}
			}
		}
		
		listaDeContatos.clear();
		listaDeContatos.addAll(pessoasFisicas);
		listaDeContatos.addAll(pessoasJuridicas);
	}
	
}


/*for(int i = 0; i < listaDeContatos.size(); i++) {

if(listaDeContatos.get(i) instanceof Fisica) {
	
	Fisica auxA = (Fisica) listaDeContatos.get(i);
	
	for (int j = 0; j < listaDeContatos.size(); j++) {
		
		if(listaDeContatos.get(j) instanceof Fisica) {
			
			Fisica auxB = (Fisica) listaDeContatos.get(j);
			
			int resp = auxA.getCpf().compareTo(auxB.getCpf());
			
			if(resp > 0 && i < j) {
				
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
			else if(resp < 0 && i > j) {
				
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
		}
		else {
			
			Juridica auxB = (Juridica) listaDeContatos.get(j);
			
			if(i > j) {
				
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
		}
	}
}
else {
	Juridica auxA = (Juridica) listaDeContatos.get(i);
	for (int j = 0; j < listaDeContatos.size(); j++) {
		if(listaDeContatos.get(j) instanceof Fisica) {
			Fisica auxB = (Fisica) listaDeContatos.get(j);
			if(j > i) {
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
		}
		else {
			Juridica auxB = (Juridica) listaDeContatos.get(j);
			int resp = auxA.getCnpj().compareTo(auxB.getCnpj());
			if(resp > 0 && i < j) {
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
			else if(resp < 0 && i > j) {
				listaDeContatos.set(i, auxB);
				listaDeContatos.set(j, auxA);
			}
		}
}

}
*/
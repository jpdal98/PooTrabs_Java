

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List <Contato> listaDeContatos = new ArrayList<>();
	
	public boolean cadastrar(Contato c) throws RegisteredException{
		for (Contato contato : listaDeContatos) {
			if(contato.getTelefone().equals(c.getTelefone())) {
				throw new RegisteredException("Número já registrado!");
			}
		}
		if(listaDeContatos.add(c)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void listar() throws EmptyException{
		if(!listaDeContatos.isEmpty()) {	
			for (Contato contato : listaDeContatos) {
				System.out.println("++--------++---------++--------++--------++"+"\nContato: "+contato.getNome()+"\nTelefone: "+contato.getTelefone()+"\nTipo: "+contato.getTipo()+"\nE-mail: "+contato.getEmail()+"\nEndereço: "+contato.getEndereco());
			}
			System.out.println("++--------++---------++--------++--------++");
		}else {
			throw new EmptyException("Agenda vazia!");
		}
	}
	
	public void pesquisar(String nome) throws NotFoundException, EmptyException {
		if(!listaDeContatos.isEmpty()) {
			int cont = 0;
			for (Contato contato : listaDeContatos) {
				if(contato.getNome().contains(nome)) {
					System.out.println("++--------++---------++--------++--------++"+"\nContato: "+contato.getNome()+"\nTelefone: "+contato.getTelefone()+"\nTipo: "+contato.getTipo()+"\nE-mail: "+contato.getEmail()+"\nEndereço: "+contato.getEndereco());
					cont++;
				}
			}
			if(cont == 0) {
				throw new NotFoundException("Nenhum contato com esse nome encontrado.");
			}
			else {
				System.out.println("++--------++---------++--------++--------++");
			}
		}
		else {
			throw new EmptyException("Agenda vazia!");
		}
	}
	
	public boolean alterar(String telefoneId, String nome, String tipo, String telefone, String email, String endereco) 
			throws NotFoundException, EmptyException {
		if(!listaDeContatos.isEmpty()) {	
			for (Contato contato : listaDeContatos) {
				if(contato.getTelefone().equals(telefoneId)){
					if(!telefone.isEmpty()) {
						contato.setTelefone(telefone);
					}
					if(!nome.isEmpty()) {
						contato.setNome(nome);
					}
					if(!email.isEmpty()) {
						contato.setEmail(email);
					}
					if(!tipo.isEmpty()) {
						contato.setTipo(tipo);
					}
					if(!endereco.isEmpty()) {
						contato.setEndereco(endereco);
					}
					
					return true;
				}
			}
			throw new NotFoundException("Contato não encontrado.");
		}else {
			throw new EmptyException("Agenda vazia!");
		}
	}
	
	public boolean deletar(String telefone) throws NotFoundException, EmptyException{
		if(!listaDeContatos.isEmpty()) {	
			for (Contato contato : listaDeContatos) {
				if(contato.getTelefone().equals(telefone)) {
					listaDeContatos.remove(contato);
					return true;
				}
			}
			throw new NotFoundException("Contato não encontrado.");
		}else {
			throw new EmptyException("Agenda vazia!");
		}
	}
	
	public void limpar() throws EmptyException{
		if(!listaDeContatos.isEmpty()) {
			listaDeContatos.clear();
		}else {
			throw new EmptyException("A agenda já está vazia");
		}
	}
}



import java.util.Scanner;

import ufc.quixada.siEs.trabalhofinal.agendadecontatos.model.Agenda;
import ufc.quixada.siEs.trabalhofinal.agendadecontatos.model.Contato;
import ufc.quixada.siEs.trabalhofinal.agendadecontatos.model.EmptyException;
import ufc.quixada.siEs.trabalhofinal.agendadecontatos.model.NotFoundException;
import ufc.quixada.siEs.trabalhofinal.agendadecontatos.model.RegisteredException;

public class Principal {
	public static Scanner in = new Scanner(System.in); 
	public static Agenda minhaAgenda = new Agenda();
	
	public static void menu() throws RegisteredException, NotFoundException, EmptyException {
		String operacao;
		System.out.println("Digite a operação a ser realizada: ");
		System.out.println("cc - Para cadastrar contato;");
		System.out.println("pc - Para pesquisar contato;");
		System.out.println("ac - Para alterar contato;");
		System.out.println("dc - Para deletar contato.");
		System.out.println("ma - Para mostrar agenda;");
		System.out.println("la - Para limpar a agenda");
		operacao = in.nextLine();
		
		if(operacao.equals("cc")) {
			
				Contato c = new Contato();
				System.out.println("Digite o nome do contato: ");
				c.setNome(in.nextLine());
				System.out.println("Digite o número do contato: ");
				c.setTelefone(in.nextLine());
				System.out.println("Digite o tipo do contato(fx - Para fixo, tc - Para celular, tt - para trabalho): ");
				c.setTipo(in.nextLine());
				System.out.println("Digite o e-mail do contato: ");
				c.setEmail(in.nextLine());
				System.out.println("Digite o endereço do contato: ");
				c.setEndereco(in.nextLine());
			try{	
				minhaAgenda.cadastrar(c);
				System.out.println("Contato cadastrado com sucesso!");
			}catch(RegisteredException e){
				System.out.println(e.getMessage());
			} 
		}else if(operacao.equals("ma")){
			try{
				minhaAgenda.listar();
			}catch(EmptyException e){
				System.out.println(e.getMessage());
			}
		}else if(operacao.equals("pc")) {
			String nome;
			System.out.println("Digite o nome do contato a ser pesquisado: ");
			nome = in.nextLine();
			try{
				minhaAgenda.pesquisar(nome);
			}catch(EmptyException e) {
				System.out.println(e.getMessage());
			}catch(NotFoundException e) {
				System.out.println(e.getMessage());
			}
		}else if(operacao.equals("ac")) {
			String idNum, novoNome, novoTelefone,novoTipo, novoEmail, novoEndereco;
			System.out.println("Digite o número que do contato que será alterado: ");
			idNum = in.nextLine();
			System.out.println("Digite o novo nome do contato: ");
			novoNome = in.nextLine();
			System.out.println("Digite o novo número do contato: ");
			novoTelefone = in.nextLine();
			System.out.println("Digite o novo tipo do contato(fx - Para fixo, tc - Para celular, tt - para trabalho): ");
			novoTipo = in.nextLine();
			System.out.println("Digite o novo e-mail do contato: ");
			novoEmail = in.nextLine();
			System.out.println("Digite o novo endereço do contato: ");
			novoEndereco = in.nextLine();
			
			try {
				minhaAgenda.alterar(idNum, novoNome, novoTipo, novoTelefone, novoEmail, novoEndereco);
				System.out.println("Contato alterado com sucesso!");
			}catch(EmptyException e) {
				System.out.println(e.getMessage());
			}catch(NotFoundException e) {
				System.out.println(e.getMessage());
			}
		}else if(operacao.equals("dc")) {
			String idNum;
			
			System.out.println("Digite o número do contato a ser deletado: ");
			idNum = in.nextLine();
			
			try {
				minhaAgenda.deletar(idNum);
				System.out.println("Contato deletado com sucesso!");
			}catch(EmptyException e) {
				System.out.println(e.getMessage());
			}catch(NotFoundException e) {
				System.out.println(e.getMessage());
			}
		}else if(operacao.equals("la")) {
			try {
				minhaAgenda.limpar();
				System.out.println("Agenda limpa!");
			}catch(EmptyException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Comando inválido! Por favor tentar novamente.");
		}
	}

	public static void main(String[] args) throws RegisteredException, NotFoundException, EmptyException {
		// TODO Auto-generated method stub
		boolean controlador = true;
		String opcao;
		do {	
			menu();
			
			System.out.println("Deseja realziar outra operação? (s - para sim, n - para não)");
			opcao = in.nextLine();
			if(opcao.equals("n")) {
				controlador = false;
			}else if(opcao.equals("s")) {
				controlador = true;
			}else {
				System.out.println("Comando inválido!");
				controlador = false;
			}
		}while(controlador);
		
		
	}

}

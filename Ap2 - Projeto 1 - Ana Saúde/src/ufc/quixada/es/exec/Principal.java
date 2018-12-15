package ufc.quixada.es.exec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ufc.quixada.es.model.Analista;
import ufc.quixada.es.model.ClientePessoaFisica;
import ufc.quixada.es.model.ClientePessoaJuridica;
import ufc.quixada.es.model.Contrato;
import ufc.quixada.es.model.Operadora;
import ufc.quixada.es.model.Pessoa;
import ufc.quixada.es.model.ServicosGerais;
import ufc.quixada.es.model.Vendedor;

public class Principal {

	public static Scanner in = new Scanner(System.in);
	public static List <Pessoa> pessoas = new ArrayList<>();
	public static List <Operadora> operadoras = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean valida;
		do {
			menu();
			System.out.println("Deseja realizar outra operação? \n1 para - Sim \n2 para - Não");
			if(in.next().equals("1")) {
				valida = true;
			}else {
				valida = false;
			}
		}while(valida);
		
		for (Operadora operadora : operadoras) {
			operadora.mostrarContratos();
		}

	}
	
	public static void menu() {
		String opcao;
		int dia;
		int mes;
		int ano;
		String cpfC;
		String cpfF;
		String cpfA;
		int codOp;
		Analista anali = new Analista();
		
		System.out.println("Qual operação deve ser realizada? Digite: \n1 para - Cadastrar Operadora \n2 para - Cadastrar Cliente"
				+ "\n3 para - Cadastrar Funcionário \n4 para - Cadastrar Contrato");
		opcao = in.next();
		if(opcao.equals("1")) {
			Operadora op = new Operadora();
			System.out.println("Digite o código da operadora: ");
			op.setCodOperadora(in.nextInt());
			System.out.println("Digite o nome da operadora: ");
			op.setNome(in.next());
			operadoras.add(op);
				
		}else if(opcao.equals("2")) {
			System.out.println("Digite o tipo se o cliente é: \n1 para - Pessoa Física \n2 para - Pessoa Jurídica");
			opcao = in.next();
			if(opcao.equals("1")) {
				ClientePessoaFisica c = new ClientePessoaFisica();
				System.out.println("Digite o nome: ");
				c.setNome(in.next());
				System.out.println("Digite o CPF: ");
				c.setCpf(in.next());
				System.out.println("Digite o endereço: ");
				c.setEndereco(in.next());
				System.out.println("Digite o dia do nascimento: ");
				dia = in.nextInt();
				System.out.println("Digite o mes do nascimento: ");
				mes = in.nextInt();
				System.out.println("Digite o ano do nascimento: ");
				ano = in.nextInt();
				c.setDataNascimento(LocalDate.of(ano, mes, dia));
				pessoas.add(c);
					
			}else if(opcao.equals("2")){
				ClientePessoaJuridica c = new ClientePessoaJuridica();
				System.out.println("Digite o nome: ");
				c.setNome(in.next());
				System.out.println("Digite o CNPJ: ");
				c.setCnpj(in.next());
				System.out.println("Digite o endereço: ");
				c.setEndereco(in.next());
				System.out.println("Digite o dia da data de abertura: ");
				dia = in.nextInt();
				System.out.println("Digite o mes da data de abertura: ");
				mes = in.nextInt();
				System.out.println("Digite o ano da data de abertura: ");
				ano = in.nextInt();
				c.setDataAbertura(LocalDate.of(ano, mes, dia));
				pessoas.add(c);
					
			}else {
				System.out.println("ERROR");
			}
				
		}else if(opcao.equals("3")) {
			System.out.println("Digite  tipo do funcionário: \n1 para - Vendedor \n2 para - Serviços Gerais \n3 para - Analista");
			opcao = in.next();
			if(opcao.equals("1")) {
				Vendedor fun = new Vendedor();
				System.out.println("Digite o nome: ");
				fun.setNome(in.next());
				System.out.println("Digite o CPF: ");
				fun.setCpf(in.next());
				System.out.println("Digite a matrícula: ");
				fun.setMatricula(in.next());
				System.out.println("Digite o salário: ");
				fun.setSalario(in.nextFloat());
					
				pessoas.add(fun);
			}else if(opcao.equals("2")) {
				ServicosGerais fun = new ServicosGerais();
					
				System.out.println("Digite o nome: ");
				fun.setNome(in.next());
				System.out.println("Digite o CPF: ");
				fun.setCpf(in.next());
				System.out.println("Digite a matrícula: ");
				fun.setMatricula(in.next());
				System.out.println("Digite o salário: ");
				fun.setSalario(in.nextFloat());
					
				pessoas.add(fun);
			}else if(opcao.equals("3")) {
				Analista fun = new Analista();
					
				System.out.println("Digite o nome: ");
				fun.setNome(in.next());
				System.out.println("Digite o CPF: ");
				fun.setCpf(in.next());
				System.out.println("Digite a matrícula: ");
				fun.setMatricula(in.next());
				System.out.println("Digite o salário: ");
				fun.setSalario(in.nextFloat());
					
				pessoas.add(fun);
			}else {
				System.out.println("ERROR");
			}
		}else if(opcao.equals("4")) {
			Contrato con = new Contrato();
			System.out.println("Digite o código do contrato: ");
			con.setCodContrato(in.nextInt());
			System.out.println("Digite o CPF ou CNPJ do cliente: ");
			cpfC = in.next();
			System.out.println("Digite o CPF do vendedor: ");
			cpfF = in.next();
			for (Pessoa pessoa : pessoas) {
				if(pessoa instanceof ClientePessoaJuridica) {
					if(((ClientePessoaJuridica) pessoa).getCnpj().equals(cpfC)) {
						con.setCliente((ClientePessoaJuridica)pessoa);
					}
				}else if(pessoa instanceof ClientePessoaFisica) {
					if(((ClientePessoaFisica) pessoa).getCpf().equals(cpfC)) {
						con.setCliente((ClientePessoaFisica) pessoa);
					}
				}else if(pessoa instanceof Vendedor) {
					if(((Vendedor) pessoa).getCpf().equals(cpfF)) {
						con.setVendedor((Vendedor)pessoa);
					}
				}
			}
			System.out.println("Digite o dia da data de início: ");
			dia = in.nextInt();
			System.out.println("Digite o mes da data de início: ");
			mes = in.nextInt();
			System.out.println("Digite o ano da data de início: ");
			ano = in.nextInt();
			con.setDataInicio(LocalDate.of(ano, mes, dia));
			System.out.println("Digite o valor do contrato: ");
			con.setValorContrato(in.nextFloat());
			System.out.println("Digite o CPF do Analista");
			cpfA = in.next();
			System.out.println("Digite o código da operadora");
			codOp = in.nextInt();
			for(Pessoa pessoa : pessoas) {
				if(pessoa instanceof Analista) {
					if(((Analista) pessoa).getCpf().equals(cpfA)) {
						anali = (Analista) pessoa;
						break;
					}
				}
			}
			for(Operadora operadora : operadoras) {
				if(operadora.getCodOperadora()==codOp) {
					anali.processarContrato(operadora, con);
				}
			}
		}
		else {
			System.out.println("Comando inválido");
		}
	}

}

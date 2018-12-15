import java.util.Scanner;

public class Controller {
		Repositorio<Cliente> usuarios;
		Repositorio<Servico> servicos; 
		Repositorio<Vendas> vendas;
		Scanner sca;
		int num = 1;
		int numerodevendas = 1;
		float saldo = 0; 
		
	public Controller() {
		sca = new Scanner(System.in);
		usuarios = new Repositorio<Cliente>("username");
		servicos = new 	Repositorio<Servico>("servicos");
		vendas = new Repositorio<Vendas>("vendas");
	}

	public String query(String line) {
		String[] ui = line.split(" ");

		
		if (ui[0].equals("addCliente")) {
			 String texto = "";
	         for(int i = 2 ; i<ui.length; i++)
	    	     texto += ui[i] + " ";
			usuarios.add(ui[1], new Cliente(ui[1], texto));
		}
		else if (ui[0].equals("showClientes")) {
			String saida = "";
			for(Cliente us : usuarios.getAll())
				saida += us.toString() + "\n";
			return saida;
		}
		else if(ui[0].equals("addAnimal")) {
			usuarios.get(ui[1]).animais.add(ui[2] , new Animal(num,ui[2],ui[3], new Cliente(usuarios.get(ui[1]).getIdcliente(), "")));
		    num++;
		}
		else if(ui[0].equals("showAnimal")) {
		   String saida = "";
		   for(Cliente us : usuarios.getAll())
			   saida += us.mostrarAnimais() + "\n";
		   return saida;
		}
		else if(ui[0].equals("showAnimalCliente"))
		   System.out.println(usuarios.get(ui[1]).animais.getAll().toString());
		else if(ui[0].equals("addServico"))
			servicos.add(ui[1], new Servico(ui[1],Float.parseFloat(ui[2])));
		else if(ui[0].equals("showServicos")) {
			String saida = "";
			for(Servico s : servicos.getAll())
				saida += s.toString() + "\n";
			return saida;
		}
		else if(ui[0].equals("vender")) {
		    usuarios.get(ui[1]); 
		    usuarios.get(ui[1]).animais.get(ui[2]);
		    servicos.get(ui[3]);
		    vendas.add(""+numerodevendas, new Vendas(ui[1],ui[2],ui[3]));
		    saldo += servicos.get(ui[3]).getPreco();
		    numerodevendas++;
		}
		else if(ui[0].equals("showVendas")){
		    String saida = "";
		    for(Vendas v : vendas.getAll())
			    saida += v.toString() + "\n";
		    return saida;
		}
		else if(ui[0].equals("showSaldo"))
			System.out.println(saldo);
		else
			return " Comando invalido";
		return "done";
	}




		public void shell() {
			while (true) {
				String line = sca.nextLine();
				try {
					System.out.println(query(line));
				} catch (RuntimeException re) {
					System.out.println(re.getMessage());
				}
			}
		}
		
		public static void main(String[] args) {
	        Controller c = new Controller();
	        c.shell();
	    }
	  
	}

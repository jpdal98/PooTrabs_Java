import java.util.Scanner;

public class Controller {
		Repositorio<User> usuarios;
		Repositorio<Nota> notas;
		Scanner sca;
		GerenciadorLogin ger;
		    
		    
	public Controller() {
		sca = new Scanner(System.in);
		usuarios = new Repositorio<User>("username");
		ger = new GerenciadorLogin(usuarios);
		notas = new Repositorio<Nota>("notas");
	}

	public String query(String line) {
		String[] ui = line.split(" ");

		if (ui[0].equals("addUser"))
			usuarios.add(ui[1], new User(ui[1], ui[2]));
		else if (ui[0].equals("showUsers")) {
			String saida = "";
			for(User us : usuarios.getAll())
				saida += us.getUsername() + "\n";
			return saida;
		}
		else if(ui[0].equals("loginUser"))
			ger.Login(ui[1], ui[2]);
		else if(ui[0].equals("logoutUser"))
			ger.Logout();
		else if(ui[0].equals("attPassword")){
			if(ger.getUser().matchPassword(ui[1]))
				ger.getUser().setPassword(ui[2]);
		}
		else if(ui[0].equals("addAnotacao")) {
		    String texto = "";
		    for(int i = 2 ; i<ui.length; i++)
		    	texto += ui[i] + "";
		    ger.getUser().notas.add(ui[1], new Nota(ui[1],texto)); 	
		}
		else if(ui[0].equals("rmAnotacao"))
			ger.getUser().notas.remove(ui[1]);
		else if(ui[0].equals("showAnotacoes")) {
			String saida ="";
		for(User u : usuarios.getAll())
			saida += u.getNotas() + "\n";
		return saida;
		}
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




import java.util.Scanner;

public class Controller {
		Repositorio<User> usuarios;
		Scanner sca;
		int numertweet= 1;
		TweetGerenciador ger;
		int contadortweets = 0;
		
	public Controller() {
		sca = new Scanner(System.in);
		usuarios = new Repositorio<User>("username");
		ger = new TweetGerenciador();
	}

	public String query(String line) {
		String[] ui = line.split(" ");

		
		if (ui[0].equals("addUser")) 
			 usuarios.add(ui[1], new User(ui[1]));
		
		else if(ui[0].equals("showUser")) {
			String saida= "";
			for(User user : usuarios.getAll())
				saida += user.toString() + " seguidores: ["+ user.showSeguidores() +"] seguidos: [" + user.showSeguidos() +"] \n";
		    return saida;
		}	
		
		else if(ui[0].equals("seguir")) 
			usuarios.get(ui[2]).seguir(usuarios.get(ui[1]));
		
		else if(ui[0].equals("criartweet")) {
	       String texto = "";
	       for(int i = 3 ; i<ui.length; i++)
	    	   texto += ui[i] + " ";
	       
	       for(User s : usuarios.get(ui[1]).getSeguidores().getAll()) 
        	   s.addTime(new Tweet(numertweet, usuarios.get(ui[1]), ui[2], texto));
           
           usuarios.get(ui[1]).criarTweet(new Tweet(numertweet, usuarios.get(ui[1]), ui[2], texto));      
           ger.gerarTweet(new Tweet(numertweet, usuarios.get(ui[1]), ui[2],texto));  
           numertweet++;
		}
		
		else if(ui[0].equals("mostrarMytweets"))
			System.out.println(usuarios.get(ui[1]).mostrarMytweets());
		
		else if(ui[0].equals("mostrartweets"))
			System.out.println(ger.showTweets());
		
		else if(ui[0].equals("mostrarTime")) 
			System.out.println(usuarios.get(ui[1]).mostrarTime());
		
		else if(ui[0].equals("liketweet")) {
			usuarios.get(ui[1]).darLike(Integer.parseInt(ui[2]));
			ger.getTweets().get(ui[2]).darLike(usuarios.get(ui[1]).getIduser());
		}
		
		else if(ui[0].equals("showlikes")) {
			System.out.println(" " + ger.getTweets().get(ui[1]).mostrarLikes());
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

import java.util.Scanner;

public class Controller {
		
		Scanner sca;
		Repositorio<Usuario> users;
		Repositorio<Grupo> grupos;
		int indicemensagem = 0;
		
	public Controller() {
		sca = new Scanner(System.in);
		users = new Repositorio<Usuario>("usuarios");
	    grupos = new Repositorio<Grupo>("grupos");
	}

	public String query(String line) {
		String[] ui = line.split(" ");

		
		if (ui[0].equals("addUser")) 
			users.add(ui[1], new Usuario(ui[1]));
		else if(ui[0].equals("creatChat")) {
			Grupo grupo = new Grupo(ui[1]);
			users.get(ui[2]).getGrupos().add(grupo.getIdgrupo(), grupo);
			grupos.add(grupo.getIdgrupo(), grupo);
			grupo.addUser(users.get(ui[2]));
			Inbox x = new Inbox(users.get(ui[2]));
			grupo.inboxs.add(users.get(ui[2]).getIduser(), x);
		}
		else if(ui[0].equals("mygrupos")) 
			System.out.println(users.get(ui[1]).mostrarGrupos());
		else if(ui[0].equals("myusers"))
			System.out.println(grupos.get(ui[1]).showUsers());
		else if(ui[0].equals("inviteaGroup")) {
			Usuario u = users.get(ui[3]);
			grupos.get(ui[1]).addByInvite(ui[2], u);
			u.getGrupos().add(grupos.get(ui[1]).getIdgrupo(), grupos.get(ui[1]));
			Inbox x = new Inbox(u);
			grupos.get(ui[1]).inboxs.add(u.getIduser(), x);
		}
		else if(ui[0].equals("enviarMensagem")) {
			indicemensagem++;
			String texto = "";
		    for(int i = 3 ; i<ui.length; i++)
		    	texto += ui[i] + " ";
			Mensagem m = new Mensagem(indicemensagem, ui[1], texto);
			users.get(ui[1]).sendMensagem(ui[2],m);
		}
		else if(ui[0].equals("smsgrupo")) {
			System.out.println(grupos.get(ui[1]).showMensagem(users.get(ui[2])));
		}
		else if(ui[0].equals("notify"))
			users.get(ui[1]).mostrarNotify();
		else if(ui[0].equals("rmUserGrupo")) {
			Grupo grupo = new Grupo(ui[1]);
			users.get(ui[2]).getGrupos().remove(grupo.getIdgrupo());
			grupo.removeUser(ui[2]);
			Inbox x = new Inbox(users.get(ui[2]));
			grupo.inboxs.remove(x.getUser().getIduser());
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

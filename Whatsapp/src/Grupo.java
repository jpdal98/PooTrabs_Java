
public class Grupo {

	private String idgrupo;
	Repositorio<Inbox> inboxs;
	Repositorio<Usuario> users;
	
	public Grupo(String idgrupo) {
		this.idgrupo = idgrupo;
		inboxs = new Repositorio<Inbox>("inbox's");
		users = new Repositorio<Usuario>("usuarios");
	}

	public String getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(String idgrupo) {
		this.idgrupo = idgrupo;
	}

	public Repositorio<Inbox> getInboxs() {
		return inboxs;
	}

	public void setInboxs(Repositorio<Inbox> inboxs) {
		this.inboxs = inboxs;
	}

	public Repositorio<Usuario> getUsers() {
		return users;
	}

	public void setUsers(Repositorio<Usuario> users) {
		this.users = users;
	}
	
	public void addUser(Usuario us) {
		users.add(us.getIduser(), us);
	}
	
	public void removeUser(String us) {
		users.remove(us);
	}
	public String showUsers() {
		String saida="[ ";
		for(Usuario u : this.users.getAll()) 
			saida+= u.toString() + " ";
		return saida + " ]";
	}
	
	 public void addByInvite(String userid, Usuario invitedUserId) {
		 for(Usuario us : this.users.getAll()) {
			 if(us.getIduser().equals(userid) && !us.getIduser().equals(invitedUserId.getIduser())) {
				 this.getUsers().add(invitedUserId.getIduser(), invitedUserId);
			 }
		 }
	 }
	 	 
	 public void deliverMsg(Mensagem msg){
		for(Inbox x : this.inboxs.getAll()) {
			x.mensagens.add(""+msg.getIdsms(), msg);
		}   
	}
	 
	public String showMensagem(Usuario iduser) {
		String saida = "";
		for (Inbox x : this.inboxs.getAll()) {
			if (x.getUser().getIduser().equals(iduser.getIduser()))
				saida += " User: " + iduser.getIduser() + " mensagens : " + x.showMensagensInbox();
		}
		return saida;
	}

	public int grupoNootify(String us) {
		int saida= 0;
		for(Inbox x : this.getInboxs().getAll()) {
			if(x.getUser().getIduser().equals(us))
				saida = x.qtdMensagensInbox();
		}
		return saida;
	}
	public String toString() {
		return "" + idgrupo;
	}
}

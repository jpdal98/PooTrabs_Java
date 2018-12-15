
public class Inbox {

	private Usuario user;
	Repositorio<Mensagem> mensagens;
	
	public Inbox(Usuario user) {
		this.user = user;
		mensagens = new Repositorio<Mensagem>("mensagens");
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Repositorio<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(Repositorio<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public String showMensagensInbox() {
		String saida="";
		for(Mensagem m: this.getMensagens().getAll())
			saida+= m.toString() + "\n";
		return saida;
	}
	
	public int qtdMensagensInbox() {
		int quantidade = 0;
		for(Mensagem m: this.getMensagens().getAll()) {
			if(!m.isLido()) {
			   quantidade++;
			   m.setLido(true);
			}
		}
		return quantidade;
	}
	public String toString() {
		return " User: " + user + " Mensagens: " + getMensagens(); 
	}
}

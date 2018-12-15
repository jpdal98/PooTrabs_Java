
public class Notify {

	private String idChat;
	private int naolidos;
	
	public Notify(String idChat, int naolidos) {
		this.idChat = idChat;
		this.naolidos = naolidos;
	}

	public String getIdChat() {
		return idChat;
	}

	public void setIdChat(String idChat) {
		this.idChat = idChat;
	}

	public int getNaolidos() {
		return naolidos;
	}

	public void setNaolidos(int naolidos) {
		this.naolidos = naolidos;
	}
	
	public String toString() {
		return "" + idChat + ": (" +naolidos+ ")";
	}
}

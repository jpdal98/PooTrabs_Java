
public class Mensagem {

	private int idsms;
	private String user;
	private String texto;
	private boolean isLido;
	
	public Mensagem(int idsms, String user, String texto) {
		this.idsms = idsms;
		this.user = user;
		this.texto = texto;
		this.isLido = false;
	}

	public boolean isLido() {
		return isLido;
	}

	public void setLido(boolean isLido) {
		this.isLido = isLido;
	}

	public int getIdsms() {
		return idsms;
	}

	public void setIdsms(int idsms) {
		this.idsms = idsms;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String toString() {
		return " " + user + " texto: " + texto;
	}
}

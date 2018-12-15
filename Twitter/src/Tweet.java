import java.util.ArrayList;

public class Tweet {

	private int idTweet;
	User us;
	private String titulo;
	private String texto;
	private boolean isLike;
	private boolean isLido;
	private ArrayList<String> quantidadedelikes ;
	
	public Tweet(int idTweet,User us,String titulo, String texto) {
		this.idTweet = idTweet;
		this.us = us;
		this.titulo = titulo;
		this.texto = texto;
		this.isLido = false;
		this.isLike = false;
		quantidadedelikes = new ArrayList<String>();
	}
	

	public int getIdTweet() {
		return idTweet;
	}

	public void setIdTweet(int idTweet) {
		this.idTweet = idTweet;
	}

	public User getUs() {
		return us;
	}

	public void setUs(User us) {
		this.us = us;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public boolean isLike() {
		return isLike;
	}


	public void setLike(boolean isLike) {
		this.isLike = isLike;
	}


	public boolean isLido() {
		return isLido;
	}


	public void setLido(boolean isLido) {
		this.isLido = isLido;
	}
	
	public ArrayList<String> getQuantidadedelikes() {
		return quantidadedelikes;
	}
	
	public void darLike(String username) {
       this.quantidadedelikes.add(username);
	}
	
	
	public String mostrarLikes() {
		String saida = "";
		for(int i = 0; i < quantidadedelikes.size(); i++) {
			saida += ":" + quantidadedelikes.get(i) + "\n";
		}
		return saida;
	}
	
	public String toString() {
		return ""+ idTweet + ": "+ us + ": " + titulo + ": " + texto ;
	}
}

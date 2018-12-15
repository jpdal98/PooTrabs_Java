
public class User {

	private String iduser;
	private Repositorio<User> seguidores;
	private Repositorio<User> seguidos;
	private Repositorio<Tweet> mytweets;
	private Repositorio<Tweet> timeline;
	Tweet mensagem;
	int contadortwittes = 0;
	
	
	public User(String iduser) {
		this.iduser = iduser;
		seguidores = new Repositorio<User>("seguidores");
		seguidos = new Repositorio<User>("seguidos");
		mytweets = new Repositorio<Tweet>("mytweets");
	    timeline = new Repositorio<Tweet>("timeline");
	}
	
	public Repositorio<Tweet> getTimeline() {
		return timeline;
	}
	

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public Repositorio<User> getSeguidores() {
		return seguidores;
	}

	public Repositorio<User> getSeguidos() {
		return seguidos;
	}
	
	public String toString() {
		return "" + iduser ;
	}
	
	public String showSeguidores() {
		String saida = "";
		for(User seg : seguidores.getAll())
			saida += seg + " ";
		return saida ;
	}
	
	public String showSeguidos() {
		String saida = "";
		for(User seg : seguidos.getAll())
			saida += seg + " ";
		return saida ;
	}

	public void seguir(User us) {
		
		us.seguidos.add(this.getIduser(), new User(this.getIduser()));
		this.seguidores.add(us.getIduser(), us);
	} 

    public void criarTweet(Tweet t) {
		this.mytweets.add(""+t.getIdTweet(), t);
    }		
    
    public void addTime(Tweet t) {
    		this.timeline.add(""+t.getIdTweet(), t);
    	
    }
    
	public String mostrarMytweets() {
    	String saida = "";  
    	for(Tweet s : mytweets.getAll()) {
    		saida += " " + s.getIdTweet() + s.getUs() + ":"+s.getTitulo() + " " + s.getTexto() + "\n"; 
    	}
    	return saida;
    }
	
	public String mostrarTime() {
    	String saida = "";
    	for(Tweet s : timeline.getAll()) {
    		if(!s.isLido()) {
    		   saida += " " + s.getIdTweet() + " " +s.getUs() + ":"+s.getTitulo() + " " + s.getTexto() + "\n"; 
    		   s.setLido(true);
    	       contadortwittes++;
    	    }
    	}
    	System.out.println(" Voce tem :" + contadortwittes + " tweets");
    	contadortwittes = 0;
    	return saida;
    }
	
	public void darLike(int idtweet) {
		for(Tweet s : timeline.getAll()) {
			if(s.getIdTweet() == idtweet){
				if(!s.isLike()) {
				   s.setLike(true);
				   return;
				}
			}
		}
		
		throw new RuntimeException("fail: você não possui esse tweet");
	}
	
	
}

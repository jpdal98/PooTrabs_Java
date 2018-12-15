
public class TweetGerenciador {

	private Repositorio<Tweet> tweets;
	
	
	public TweetGerenciador() {
		tweets = new Repositorio<Tweet>("tweets");
	}

	public Repositorio<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(Repositorio<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	public void gerarTweet(Tweet t) {
		this.tweets.add(""+t.getIdTweet(), t);
	}
	
	public String showTweets() {
		String saida = "";
		for(Tweet t : tweets.getAll())
			saida += t.toString() + "\n";
		return saida;
	}
}

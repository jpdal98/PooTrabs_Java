
public class Password extends Entry {

    private String password;
	
	public Password(String id, String password) {
		super(id);
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "" + super.toString();
	}
}

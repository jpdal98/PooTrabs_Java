
public class Fone {

	private String idfone;
	private String number;
	
	public Fone(String idfone, String number) {
		this.idfone = idfone;
		this.number = number;
	}

	public String getIdfone() {
		return idfone;
	}

	public void setIdfone(String idfone) {
		this.idfone = idfone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return  idfone + ":" + number;
	}
}

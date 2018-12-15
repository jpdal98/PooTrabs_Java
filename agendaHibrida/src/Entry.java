
public abstract class Entry {

	private String identrada;
	private boolean isfavorit ;
	
	public Entry(String identrada) {
		this.identrada = identrada;
		isfavorit = false;
	}

	public String getIdentrada() {
		return identrada;
	}

	public void setIdentrada(String identrada) {
		this.identrada = identrada;
	}

	public boolean isIsfavorit() {
		return isfavorit;
	}

	public void setIsfavorit(boolean isfavorit) {
		this.isfavorit = isfavorit;
	}
	
	public String converte(int qtd) {
		String saida="";
		for(int i=0; i<qtd; i++)
			saida += '*';
		return saida;
	}
	
	public String toString() {
		if(isfavorit)
		    return "@" + identrada ;
		else
			return "-" + identrada;
	}
	
}


public class Contato extends Entry{

	private Repositorio<Fone> fones;
	
	public Contato(String id) {
		super(id);
		fones = new Repositorio<Fone>("telefones");
	}

	public Repositorio<Fone> getFones() {
		return fones;
	}

	public void setFones(Repositorio<Fone> fones) {
		this.fones = fones;
	}
	
	public void addFone(Fone f) {
		this.fones.add(f.getIdfone(), f);
	}
	
	public void rmFone(String idfone) {
	    this.fones.remove(idfone);	
	}
	
	public String mostrarFone() {
		String saida = " [";
		for(Fone f : fones.getAll())
			saida += f.toString() + "]" + "\n";
		return saida;
	}
	public String toString() {
		return super.toString() + fones.toString();
	}
}

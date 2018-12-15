
public class MasterAgenda extends Agenda {

	private Agenda agenda;
	private Repositorio<Contato> contatos;
	private Repositorio<Nota> notas;
	private Repositorio<Password> senhas;
	private String senhamestra;
	
	
	public MasterAgenda(Agenda agenda) {
		this.agenda = agenda;
		this.senhamestra = senhamestra;
        contatos = new Repositorio<Contato>("contatos");
        notas = new Repositorio<Nota>("notas");
        senhas = new Repositorio<Password>("senhas");
	}
	
	public Repositorio<Password> getSenhas() {
		return senhas;
	}

	public void setSenhas(Repositorio<Password> senhas) {
		this.senhas = senhas;
	}

	public String getSenhamestra() {
		return senhamestra;
	}

	public void setSenhamestra(String senhamestra) {
		this.senhamestra = senhamestra;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	 public Repositorio<Contato> getContatos() {
			return contatos;
		}

		public Repositorio<Nota> getNotas() {
			return notas;
		}

	
	public void addNote() {
		for(Entry e: agenda.getEntradas().getAll()) {
			if(e instanceof Nota)
		       this.notas.add(e.getIdentrada(),new Nota(e.getIdentrada(),((Nota) e).getTexto()));
		}
	}
		
	public void addContato() {
		for(Entry e: agenda.getEntradas().getAll()) {
			if(e instanceof Contato)
		       this.contatos.add(e.getIdentrada(),new Contato(e.getIdentrada()));
		}
	}
	
	public void addPass() {
		for(Entry e: agenda.getEntradas().getAll()) {
			if(e instanceof Password)
		       this.senhas.add(e.getIdentrada(), new Password(e.getIdentrada(),((Password) e).getPassword()));
		}
    }
	
	public void mostrarSenhas(String password) {
		if (password.equals(senhamestra)) {
			String saida = "";
			for (Password p : this.senhas.getAll())
				saida += p.toString() + " " + p.getPassword() + "\n";
			System.out.println(saida);
		} else {
			String sai = "";
			for (Password p : this.senhas.getAll()) {
				int quantidade = p.getIdentrada().length();
				sai += p.toString() + " " + p.converte(quantidade);
			}
			System.out.println(sai);
		}
	}
	
	public void mostrarSenhas() {
		String sai = "";
		for (Password p : this.senhas.getAll()) {
			int quantidade = p.getIdentrada().length();
			sai += p.toString() + " " + p.converte(quantidade);
		}
		System.out.println(sai);
	}

}

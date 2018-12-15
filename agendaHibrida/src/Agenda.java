
public class Agenda {

	private Repositorio<Entry> entradas;
	private Repositorio<Entry> favoritos;
	int quantidade = 0;
	public Agenda() {
		entradas = new Repositorio<Entry>("entradas");
		favoritos = new Repositorio<Entry>("favoritos");
	}

	public Repositorio<Entry> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Repositorio<Entry> favoritos) {
		this.favoritos = favoritos;
	}

	public Repositorio<Entry> getEntradas() {
		return entradas;
	}
	
	
	public void rmEntry(String identrada) {
		this.entradas.remove(identrada);
	}
	
	public String mostrarFavoritos() {
		String saida="";
		for(Entry t : favoritos.getAll())
			saida += t.toString() + "\n";
		return saida;
	}
	
	public void favoritar(Entry id) {
		if(!id.isIsfavorit())
			id.setIsfavorit(true);
		this.favoritos.add(id.getIdentrada(), id);
	}
	
	public void desfavoritar(Entry id) {
		if(id.isIsfavorit())
			id.setIsfavorit(false);
		this.favoritos.remove(id.getIdentrada());
	}
	
	public String mostrar() {
		String saida="";
		for(Entry t : entradas.getAll()) {
			if(t instanceof Password) {
				quantidade = ((Password) t).getPassword().length();
				   saida += t.toString() + " " + t.converte(quantidade) + "\n";
			}
			else
			saida += t.toString() + "\n";
		}
		
		
		return saida;
	}
}

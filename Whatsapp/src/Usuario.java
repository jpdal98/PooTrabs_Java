
public class Usuario {

	private String iduser;
	Repositorio<Grupo> grupos;
	
	public Usuario(String iduser) {
		this.iduser = iduser;
		grupos = new Repositorio<Grupo>("grupos");
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public Repositorio<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Repositorio<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	//public String getNotify(){
		 
//	 }
	
	public void sendMensagem(String idchat, Mensagem sms) {
		for (Grupo gr : this.getGrupos().getAll()) {
			if (gr.getIdgrupo().equals(idchat)) {
				gr.deliverMsg(sms);
				return;
			}
		}
		throw new RuntimeException("fail: você não possui esse grupo!");
	}
	
	public String mostrarGrupos() {
		String saida="[ ";
		for(Grupo g: this.getGrupos().getAll())
			saida+= g.toString() + " ";
		return saida + " ]";
	}
	
	public String mostrarNotify() {
		String saida ="";
		for(Grupo g : this.getGrupos().getAll()) {
			int aux = g.grupoNootify(this.iduser);
			saida+= ""+g.getIdgrupo() + "(" + aux + ")";
		}
		return saida;
	}
	public String toString() {
		return " " + iduser;
	}
}

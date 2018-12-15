import java.util.ArrayList;
import java.util.Scanner;

class Contato{
	public String nome;
	ArrayList<Telefone> telefones;
	 
	public Contato(String nome) {
		this.nome = nome;
		telefones = new ArrayList<Telefone>();
	}

	public String toString() {
		return nome  ;
	}

	public void addFone(Telefone tel) {
		  for(Telefone t : this.telefones) {
	            if(t.foneid.equals(tel.foneid))
		            throw new RuntimeException("Nao da");
		  }
	           this.telefones.add(tel);

	}

	public void rmFone(String foneid) {
		for (int i = 0; i<telefones.size();i++) 
			if (telefones.get(i).foneid.equals(foneid))
		           telefones.remove(telefones.get(i));
				
	}
	 
	public String mostrarTelefones() {
		String saida = "";
		for(Telefone tel: this.telefones) 
		  	saida += tel + "\n";
		return saida;
	}
	
	
	
 }
 
 


 class Telefone{
	public String foneid;
	public String numero;
	 
	public Telefone(String foneid, String numero) {
		this.foneid = foneid;
		this.numero = numero;
	}

	public String toString() {
		String saida= "";
		if(foneid != null )
			saida += "["+ foneid  +":" +numero +"]";
		else
			saida += " ";
		return saida;
	}
 }









public class Controller {

	Contato cont1;
	Scanner sca;
	    
	    
	public Controller() {
		sca = new Scanner(System.in);
		
	}

	public String query(String line) {
		String[] ui = line.split(" ");
		
	    if (ui[0].equals("init"))
			cont1 = new Contato(ui[1]);
	    else if (ui[0].equals("show"))
			return "" + cont1 + cont1.mostrarTelefones();
		else if (ui[0].equals("addFone"))
			cont1.addFone(new Telefone(ui[1],ui[2]));
		else if (ui[0].equals("rmFone"))
			cont1.rmFone(ui[1]);
		return "done";
	}




	public void shell() {
		while (true) {
			String line = sca.nextLine();
			try {
				System.out.println(query(line));
			} catch (RuntimeException re) {
				System.out.println(re.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
        Controller c = new Controller();
        c.shell();
    }
  
}
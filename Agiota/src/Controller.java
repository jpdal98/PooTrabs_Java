import java.util.Scanner;

public class Controller {
	Sistema sist1;
	Scanner sca;
	    
	    
	public Controller() {
		sca = new Scanner(System.in);
		
	}

	public String query(String line) {
		String[] ui = line.split(" ");
		
	    if (ui[0].equals("init"))
			sist1 = new Sistema(Float.parseFloat(ui[1]));
	    else if (ui[0].equals("show"))
			return " " + sist1 ;
	    else if(ui[0].equals("cadastrarCliente"))
	    	sist1.cadastrarClientes(ui[1],ui[2]);
	    else if(ui[0].equals("mostrarDividas"))
	    	return "" + sist1.mostrarDividas() ;
	    else if(ui[0].equals("emprestarDinheiro"))
	    	sist1.emprestarDinheiro(ui[1],Float.parseFloat(ui[2]));
	    else if(ui[0].equals("mostrarClientes"))
	    	return ""+ sist1.mostrarClientes();
	    else if(ui[0].equals("mostrarClienteEspecifico"))
	        sist1.mostrarClienteEspecifico(ui[1]);
	    else if(ui[0].equals("receberDinheiro"))
	    	sist1.receberDinheiro(ui[1],Float.parseFloat(ui[2]));
	    else if(ui[0].equals("matarCliente"))
	    	sist1.matarCliente(ui[1]);
	    else
	    	return " Comando invalido";
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


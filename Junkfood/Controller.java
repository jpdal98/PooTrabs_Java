import java.util.ArrayList;
import java.util.Scanner;

 class JunkFood{

	double troco = 0;
	double saldo = 0;
	double lucro = 0;
	ArrayList<Espiral> espirais;
	
	public JunkFood(int qtdEspirais, int maxProdutos){
		this.espirais = new ArrayList<Espiral>();
		for(int i = 0; i < qtdEspirais; i++)
			this.espirais.add(new Espiral());
	}
	
	public String toString() {
		String saida ="";
		for(int i = 0; i < espirais.size(); i++)
			saida += " " + espirais.get(i).toString() +" troco:"+ troco +" lucro: " + lucro + " saldo: "+saldo+"\n";
		return saida;
	}
	
	public void addEspiral(int indice, String nome, int qtd, float preco) {
		espirais.get(indice).nome = nome;
		espirais.get(indice).quantidade = qtd;
		espirais.get(indice).preco = preco;
		
	}
	
	public void limparEspiral(int indice) {
		this.espirais.get(indice).nome = "-";
		this.espirais.get(indice).quantidade = 0;
		this.espirais.get(indice).preco = 0f;
	}
	
	public void attEspiral(int indice, String nome, int qtd, float valor) {
		this.espirais.get(indice).nome = nome;
		this.espirais.get(indice).quantidade = qtd;
		this.espirais.get(indice).preco = valor;
	}
	
	public void comprarProduto(String nome) {
		for(Espiral esp : espirais) {
			if(esp.nome.equals(nome)) 
				if(saldo >= esp.preco) {
					esp.quantidade--;
			        lucro = esp.preco + lucro;
			        saldo = saldo - esp.preco;
			        troco = saldo;
			        saldo = troco - saldo;
				}
			
			else
				throw new RuntimeException("Produto nao encontrado ou saldo insuficiente");
			        	
		}
		
		
	}
	
	public void adicionarDinheiro(float valor) {
		saldo += valor;
	}
	
	
}


class Espiral{
	
	public String nome = " - ";
	public int quantidade = 0;
	public float preco = 0f;

	public String toString() {
		return "["+ nome + " : "+ quantidade + " U" + " : " + preco + " RS]";
	}

}



public  class Controller {

	JunkFood maquina;
	static final int DEFAULT_ESPIRAIS = 3;
	static final int DEFAULT_MAX = 5;
	Scanner sca;

	public Controller() {
		maquina = new JunkFood(DEFAULT_ESPIRAIS, DEFAULT_MAX);
		sca = new Scanner(System.in);
	}

	public String oracle(String line) {
		String ui[] = line.split(" ");

		if (ui[0].equals("help"))
			return "show, init _espirais _maximo";
		else if (ui[0].equals("init"))
			maquina = new JunkFood(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
		else if (ui[0].equals("show"))
			return "" + maquina;
		else if (ui[0].equals("addEspiral"))
			maquina.addEspiral(Integer.parseInt(ui[1]),ui[2], Integer.parseInt(ui[3]), Float.parseFloat(ui[4]));
		else if(ui[0].equals("limparEspiral"))
			maquina.limparEspiral(Integer.parseInt(ui[1]));
		else if (ui[0].equals("attEspiral"))
			maquina.attEspiral(Integer.parseInt(ui[1]),ui[2], Integer.parseInt(ui[3]), Float.parseFloat(ui[4]));
		else if(ui[0].equals("adicionarDinheiro"))
			maquina.adicionarDinheiro(Float.parseFloat(ui[1]));
		else if(ui[0].equals("comprarProduto"))
			maquina.comprarProduto(ui[1]);
		else
			return "comando invalido";
		return "done";
	}

	public void shell() {
		while (true) {
			String line = sca.nextLine();
			try {
				System.out.println(oracle(line));
			} catch (RuntimeException re) {
				System.out.println(re.getMessage());
			}
		}
	}
	
   public static void main(String[] args){
        Controller c = new Controller();
        c.shell();
    }
  
}



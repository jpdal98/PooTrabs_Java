package calculadora;

import java.util.Scanner;



public class Calculadora {
	static final int bateriaInicial = 2;
	static final int bateriaMaxima = 5;
	
	int bateria;
	
	public Calculadora() {
		this.bateria = Calculadora.bateriaInicial;
	}
	
	void charge(int value){
		if(value < 0)
			return;
		this.bateria += value;
		if(this.bateria > Calculadora.bateriaMaxima)
			this.bateria = Calculadora.bateriaMaxima;
	}
	
	float soma(float a, float b) throws Exception{
		if(this.bateria == 0)
			throw new Exception("bateria insuficiente");
		this.bateria -= 1;
		return a + b;
	}
	
	float divisao(float num, float den) throws Exception{
		if(this.bateria == 0)
			throw new Exception("bateria insuficiente");
		if(den == 0f)
			throw new Exception("divisao por 0");
		this.bateria -= 1;
		return num/den;
	}
	
	public String toString(){
		return "bateria: " + this.bateria;
	}
}


class Controller{
	Calculadora calc;
	
	public Controller() {
		calc = new Calculadora();
	}
	
	private float toFloat(String s) {
		return Float.parseFloat(s);
	}
	
	public String oracle(String line) throws Exception {
		String ui[] = line.split(" ");

		if(ui[0].equals("show"))
			return "" + calc;
		else if(ui[0].equals("charge"))
			calc.charge(Integer.parseInt(ui[1]));
		else if(ui[0].equals("soma"))
			return "= " + calc.soma(toFloat(ui[1]),
									toFloat(ui[2]));
		else if(ui[0].equals("div"))
			return "= " + calc.divisao(toFloat(ui[1]),
									   toFloat(ui[2]));
		else
			return "comando invalido";
		return "done";
	}
}

class IO {
	static Scanner scan;
	
	public IO(){
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		Controller cont = new Controller();
		while(true){
			System.out.println("Digite um comando:");
			String line = scan.nextLine();

			try {
				System.out.println(cont.oracle(line));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}






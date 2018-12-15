import java.util.Scanner;

public class i {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}
	public static void menu() {
		System.out.println("Digite dois números para serem operados: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Digite qual o perção deseja realizar: ");
		System.out.println("+(adição), -(subtração), *(multiplicação) ou /(divisão)");
		
		String choose = scan.next();
		double result = calculadora(a,b,choose);
		if(result == -999.99) {
			System.out.println("Operação inválida.");
		}else {
			System.out.println("Resultado: " + result);
		}
		
	}
	public static double calculadora(double x, double y, String o) {
		switch(o) {
		case "+":
			return x+y;
		case "-":
			return x-y;
		case "*":
			return x*y;
		case "/":
			return x/y;
		default:
			return -999.99;
		}
	}
}

import java.util.Scanner;

public class i {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}
	public static void menu() {
		System.out.println("Digite dois n�meros para serem operados: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Digite qual o per��o deseja realizar: ");
		System.out.println("+(adi��o), -(subtra��o), *(multiplica��o) ou /(divis�o)");
		
		String choose = scan.next();
		double result = calculadora(a,b,choose);
		if(result == -999.99) {
			System.out.println("Opera��o inv�lida.");
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

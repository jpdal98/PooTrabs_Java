import java.util.Scanner;

public class e {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite suas duas notas: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println(mediaAprovado(a,b));
	}
	public static boolean mediaAprovado(double notaA, double notaB) {
		return !(((notaA+notaB)/2) < 7);
	}

}

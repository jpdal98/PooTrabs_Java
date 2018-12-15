import java.util.Scanner;

public class g {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		System.out.println("O número é primo: " + primo(num));
	}
	public static boolean primo(int a) {
		int cont = 0;
		for (int i = 1; i <= a ; i++) {
			if(a%i == 0) {
				cont++;
			}
		}
		return !(cont != 2);
	}

}

import java.util.Scanner;
public class j {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite sua data de nascimento: ");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();
		
		wesleySafadao(dia, mes, ano);

	}
	public static int somatorio(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n+somatorio(n-1);
		}
	}
	public static void wesleySafadao(int d, int m, int a) {
		int safadeza = ((somatorio(m)) + (a/100) * (50-d))/10;
		int anjo = 100 - safadeza;
		System.out.println(anjo+"% anjo "+safadeza+"% vagabundo.");
	}

}

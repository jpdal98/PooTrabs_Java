import java.util.Scanner;

public class k {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite 2 números: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(cores(a,b));
	}
	public static String cores(int um, int dois) {
		if(um%2==0 && dois%2==0) {
			return "AZUL";
		}
		else if(um%2!=0 && dois%2!=0) {
			return "VERMELHO";
		}
		else {
			return "AMARELO";
		}
	}

}

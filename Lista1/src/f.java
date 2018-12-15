import java.util.Scanner;

public class f {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número: ");
		int a = scan.nextInt();
		System.out.println(fatorial(a));
	}
	public static int fatorial(int a){
		if(a == 1 || a == 0) {
			return 1;
		}
		else {
			return a*fatorial(a-1);
		}
	}

}

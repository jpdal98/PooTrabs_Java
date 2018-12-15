import java.util.Scanner;
 class ListaUm {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		System.out.println("Digite dois números:");
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("O maior valor é: "+ retornaMaior(a,b));
		
	}
	public static int retornaMaior(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else if(num1 < num2){
			return num2;
		}
		else {
			return num1;
		}
	}

}

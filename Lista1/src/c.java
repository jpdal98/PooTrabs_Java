import java.util.Scanner;

public class c {
	
	public static String nome;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Seu nome é: " + mostraNome());
	}
	public static String mostraNome() {
		return nome;
	}

}

import java.util.Scanner;

public class d {

	public static String nome, sobrenome;
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite seu nome e sobrenome, um de cada vez: ");
		nome = scan.next();
		sobrenome = scan.next();
		escreveCemVezes();
	}
	public static void escreveCemVezes() {
		for (int i = 0; i < 50; i++) {
				System.out.println(nome);
				System.out.println(sobrenome);
		}
	}

}

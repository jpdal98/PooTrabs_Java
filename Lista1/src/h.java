import java.util.Scanner;

public class h {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		System.out.println("Digite suas 2 notas");
		a = scan.nextDouble();
		b = scan.nextDouble();
		System.out.println(mediaAprovado(a,b));
	}
	public static String mediaAprovado(double notaA, double notaB) {
		double media = (notaA+notaB)/2;
		double af;
		if(media < 7) {
			if(media > 4) {
				System.out.println("Digite sua AF: ");
				af = scan.nextDouble();
				if((media + af)/2 >= 5) {
					return "Aprovado por conceito B.";
				}else {
					return "Reprovado na AF.";
				}
			}else {
				return "Reprovado.";
			}
		}else {
			return "Aprovado por conceito A.";
		}
	}


}

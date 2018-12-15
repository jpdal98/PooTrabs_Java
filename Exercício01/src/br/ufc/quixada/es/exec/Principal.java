package br.ufc.quixada.es.exec;

import java.util.Scanner;
import br.ufc.quixada.es.model.Aluno;

public class Principal {

	private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a = new Aluno();
		scan = new Scanner(System.in);
		System.out.println("Digite seu nome, idade e curso a cada 'enter': ");
		a.setNome(scan.next());
		a.setCurso(scan.next());
		a.setIdade(scan.nextInt());
		a.setIra(scan.nextFloat());
		System.out.println(a);
		
		/*System.out.println("Digite uma matéria que deseja estudar: ");
		String materia = scan.next();
		a.estudar(materia);
		System.out.println("Digite uma diciplina q deseja se matricular: ");
		String diciplina = scan.next();
		a.matricular(diciplina);
		*/
	}

}

package br.ufc.quixada.exec;

import br.ufc.quixada.model.Cliente;
import br.ufc.quixada.model.Corrida;
import br.ufc.quixada.model.Motorista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorista motA = new Motorista("Pedro","CE-8872","CDO-4213",0.0f);
		Motorista motB = new Motorista("Carlos","CE-8721","HVV-7632",0.0f);
		Motorista motC = new Motorista("Douglas","CE-6521","FGQ-0972",0.0f);
		
		Cliente clieA = new Cliente("Diego","888.431.443-65");
		Cliente clieB = new Cliente("Bernardete","341.432.673-89");
		Cliente clieC = new Cliente("Rafael","777.777.777-77");
		
		Corrida corrA = new Corrida("Morada Nova", "Rio Branco",0.15f,0.0f);
		Corrida corrB = new Corrida("Quixada", "Morada Nova", 0.02f, 0.0f);
		Corrida corrC = new Corrida("Horizonte", "Fortaleza",0.02f,0.0f);
		
		clieA.darNotaAoMotorista(motA);
		clieB.darNotaAoMotorista(motB);
		clieC.darNotaAoMotorista(motC);
		System.out.println("----------------------------------------");
		System.out.println("Valor da corrida de "+ clieA.getNome()+": "+corrA.calcularValorCorrida(10000));
		System.out.println("----------------------------------------");
		System.out.println("Valor da corrida de "+ clieB.getNome()+": "+corrB.calcularValorCorrida(3000));
		System.out.println("----------------------------------------");
		System.out.println("Valor da corrida de "+ clieC.getNome()+": "+corrC.calcularValorCorrida(1500));
		System.out.println("----------------------------------------");
		motA.realizarCorrida(clieA, corrA);
		System.out.println("----------------------------------------");
		motB.realizarCorrida(clieB, corrB);
		System.out.println("----------------------------------------");
		motC.realizarCorrida(clieC, corrC);
		System.out.println("----------------------------------------");
	}

}

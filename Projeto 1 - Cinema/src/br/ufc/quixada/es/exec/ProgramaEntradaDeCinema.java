package br.ufc.quixada.es.exec;

import br.ufc.quixada.es.model.EntradaDeCinema;

public class ProgramaEntradaDeCinema {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntradaDeCinema enA = new EntradaDeCinema("Rei Leão", "20:00", 1, 1, (float) 16.00, true);
		EntradaDeCinema enB = new EntradaDeCinema("Rei Leão", "20:00", 1, 2, (float) 16.00, true);
		EntradaDeCinema enC = new EntradaDeCinema("Rei Leão", "20:00", 1, 3, (float) 16.00, true);
		System.out.println(enA);
		System.out.println(enB);
		System.out.println(enC);
		float valorA = enA.calculaValorComDesconto(12, 12, 2007);
		float valorB = enB.calcularValorComDesconto(11, 12, 1999, 428591);
		float valorC = enC.calcularValorComDesconto(07, 05, 1997, 877231);
		
		System.out.println("Valor do ingresso: "+ valorA);
		System.out.println("Valor do ingresso: "+ valorB);
		System.out.println("Valor do ingresso: "+ valorC);
		
		enA.realizarVenda();
		enB.realizarVenda();
		enC.realizarVenda();
		
		System.out.println(enA);
		System.out.println(enB);
		System.out.println(enC);

	}

}

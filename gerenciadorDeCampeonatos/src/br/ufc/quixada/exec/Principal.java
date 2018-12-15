package br.ufc.quixada.exec;

import java.util.Scanner;

import br.ufc.quixada.model.Jogador;
import br.ufc.quixada.model.Partida;
import br.ufc.quixada.model.Time;

public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		
		Time aP = new Time();
		Time oP = new Time();
		
		aP.setNome("Águias Prateadas");
		oP.setNome("Ortinitorrinco Perry");
		
		adicionarJogadores(5,aP);
		adicionarJogadores(5,oP);
		
		Partida p = new Partida();
		p.setId(28812);
		p.gerarResultado(aP, oP);

	}
	
	public static void adicionarJogadores(int qtd, Time ex) {
		for(int i = 0; i < qtd; i++) {
			Jogador jog = new Jogador();
			System.out.println("Nome do jogador: ");
			jog.setNome(entrada.next());
			System.out.println("CPF do jogador: ");
			jog.setCpf(entrada.next());
			ex.setContador(i);
			ex.adicionarJogadorAoTime(jog);
		}
	}

}

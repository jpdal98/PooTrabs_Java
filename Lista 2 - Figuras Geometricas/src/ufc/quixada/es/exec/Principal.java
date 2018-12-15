package ufc.quixada.es.exec;

import ufc.quixada.es.model.Circulo;
import ufc.quixada.es.model.Quadrado;
import ufc.quixada.es.model.Retangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo("Roxo", true, 5);
		Retangulo r = new Retangulo("Preto", false, 10.4, 5.5);
		Quadrado q = new Quadrado("Verde", true, 7);
		
		System.out.println("Area do circulo: " +c.area()+"\nPerimetro do circulo: "+ c.perimetro());
		System.out.println("Area do retangulo: " +r.area()+"\nPerimetro do retangulo: "+ r.perimetro());
		System.out.println("Area do quadrado: " +q.area()+"\nPerimetro do quadrado: "+ q.perimetro());
		
		c.preenchido();
		r.preenchido();
		q.preenchido();
	}

}

package oo.heranca.teste;

import oo.heranca.desafio.HyperCar1billionDollar;
import oo.heranca.desafio.Uno; 

public class Teste {
	public static void main(String[] args) {
		
		Uno uno = new Uno();
		HyperCar1billionDollar h1 = new HyperCar1billionDollar();
		
		uno.acelerar();
		h1.acelerar();
		
		System.out.println(h1);
		System.out.println(uno);
		
		System.out.println(uno.velocidadeAtual);
		
		uno.frear();
		uno.frear();
		
		System.out.println(uno);
		
		h1.ligarTurbo();
		h1.acelerar();
		
		System.out.println(h1 );
	}
}

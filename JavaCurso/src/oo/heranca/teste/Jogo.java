package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro j1 = new Monstro();
		
		 j1.x = 15;
		 j1.y = 20;
		 
		 Heroi j2 = new Heroi();
		 
		 j2.x = 15;
		 j2.y = 21;
		 
				 	
		 System.out.println(j1.vida);
		 System.out.println(j2.vida);
		 
		 j1.atacar(j2);
		 j1.atacar(j2);
		 j1.atacar(j2);
		 j1.atacar(j2);
		 
		 System.out.println(j2.vida);
		 
		 j2.atacar(j1);
		 j2.atacar(j1);
		 j2.atacar(j1);
		 j2.atacar(j1);
		
		 System.out.println(j1.vida);
	}
}

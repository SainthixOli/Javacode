package Exercicios.operadores;

public class DesafioOperadores {
	public static void main(String[] args) {
		
	boolean tb1 = false;
	boolean tb2 = false;
	
	boolean cn1 = (tb1 && tb2);
	System.out.println("\nUma vida com uma tv55 polegadas seria massa, alemde um sorvetinho! Isso é possivel? " + cn1);

	boolean cn2 = (tb1 ^ tb2);
	System.out.println("\nTvzinha de 32 polegadas ta otimo, alem do sorvetinho. Isso sera realidade? " + cn2);
	
	boolean cn3 = (!tb1);
	boolean cn4 = (!tb2);
	boolean c = cn3 && cn4;
	System.out.println("\nVida saudavel, sem porra nenhuma :c :c :c? " + c);
	
	}

}

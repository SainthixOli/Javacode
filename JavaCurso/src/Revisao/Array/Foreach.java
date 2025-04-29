package Revisao.Array;

public class Foreach {
	public static void main(String[] args) {
		
		double[] notas = { 9.9, 6.2, 6.4, 8.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}
}

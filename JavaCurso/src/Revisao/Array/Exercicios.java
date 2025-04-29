package Revisao.Array;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.2;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 9.2;
		
		Arrays.toString(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		
		int total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		double media = total / notasAlunoA.length;
		
		System.out.println(media);
	
	}
}

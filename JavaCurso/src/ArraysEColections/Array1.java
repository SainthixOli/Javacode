package ArraysEColections;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.1;
		notasAlunoA[1] = 9.2;
		notasAlunoA[2] = 8.1;
		
		String imprimirNotas = Arrays.toString(notasAlunoA);
		
		System.out.println("As notas do aluno x são: " + imprimirNotas);
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		double mediaA = totalAlunoA / notasAlunoA.length;
		System.out.println(mediaA);
		
		double[] notasAlunoB = {8.3, 9.2, 6.5};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
			
		}
		
		double mediaB = totalAlunoB / notasAlunoB.length;
		
		System.out.println(mediaB);
		
		
	}
}

package ArraysEColections;

import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.1;
		notasAlunoA[1] = 9.2;
		notasAlunoA[2] = 8.1;
		
		String imprimirNotas1 = Arrays.toString(notasAlunoA);
		
		System.out.println("As notas do aluno x são: " + imprimirNotas1);
		
		double totalAlunoA = 0;
		
		for(double nota1: notasAlunoA) {
			totalAlunoA += nota1;
		}
		
		double mediaA = totalAlunoA / notasAlunoA.length;
		System.out.println("A media do aluno x é igual a: " + mediaA);
		
		
		double[] notasAlunoB = {8.3, 9.2, 6.5};
		
		String imprimirNotas2 = Arrays.toString(notasAlunoB);
		
		System.out.println("\nAs notas do aluno y são: " + imprimirNotas2);
		
		double totalAlunoB = 0;
		
		for(double nota2: notasAlunoB) {
			totalAlunoB += nota2;
		}
		
		double mediaB = totalAlunoB / notasAlunoB.length;
		
		System.out.println("A media do aluno y é igual a:  " + mediaB);
		
		
	}
}



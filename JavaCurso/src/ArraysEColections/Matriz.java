package ArraysEColections;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = sc.nextInt();
		
		System.out.println("Quantas notas? ");
		int qtdeNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos] [qtdeNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.println("Informe a nota do aluno: ");
				notasDaTurma[a][n] = sc.nextDouble();
				
				total += notasDaTurma[a][n];
			}
		}
		
		
		double media = total/ (qtdeAlunos * qtdeNotas);
		
		System.out.println("A media da turma é igual a: " + media);
		
		
		
		
		sc.close();
	}
}

package ArraysEColections;

import java.util.Scanner;

public class ExercArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas que deseja inserir aqui: ");
		int quantidadeNotas = sc.nextInt();
		
		double[] notasAluno = new double[quantidadeNotas];
		
		for(int i = 0; i < notasAluno.length; i++) {
			System.out.println("Insira a nota: ");
			double nota = sc.nextDouble();
			notasAluno[i] = nota;
		}
		
		double totalAluno = 0;
		for(double n: notasAluno) {
			totalAluno += n;
		}
		
		double media = totalAluno / quantidadeNotas;
		
		System.out.printf("A media do aluno é igual a: %.2f ", media);
		
		sc.close();
		
	}
}

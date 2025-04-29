package Revisao.Array;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtdNotas; 
		double soma = 0, media = 0, a;
		
		System.out.println("Quantas notas vc quer digitar?");
		qtdNotas = sc.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < qtdNotas; i++) {
			a = 0;
			System.out.println("Digite a nota " + (i + 1));
			a = sc.nextDouble();
			notas[i] = a;
		}
	
		for(double nota : notas) {
			soma += nota; 
		}
		
		media = soma / qtdNotas;
		System.out.printf("\nA media do aluno é: %f", media);
		
		sc.close();
	}
}

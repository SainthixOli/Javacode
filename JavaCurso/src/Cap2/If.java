package Cap2;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSeja bem-vindo a simulacao de nota da escola Maria Rosselia! :)");
		
		System.out.println("\nEscreva a media: ");
		double media = sc.nextDouble();
		
		
		
		if(media >= 6.0 && media <= 10) { 
			System.out.println("Parabens, vc passou na porra da materia animal!");
		} 
		
		if(media >= 9.0 ) {
			System.out.println("Voce é um orgulho para essa instituiçao de ensino... Voce participa da nine class!");
		}
		
		if (media <= 8.9) {
			System.out.println("Voce consegue melhorar concerteza, mas vai depender unica e exclusivamente de VC!");
			
		}
		
		if(media <= 7.9) {
			System.out.println("Melhore, nao queremos alunos medianos nessa instituçao!");
		}
		
		if(media <= 5.9) { 
			System.out.println("Você é uma vergonha para nossa instituicao! RECUPERACAO!");
		}
		 
		if(media <= 3.9) {
			System.out.println("Reprovado direto sem chance de fazer uma prova de recuperaçao! Vergonha");
		}
		
		System.out.println("\nObrigado!");
		
		sc.close();
	}
}

package Cap2;

import java.util.Scanner;

public class NotasAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Escreva uma nota: ");
		double nota = sc.nextDouble();
		
		System.out.println("\nEscreva outra nota: ");
		double nota2 = sc.nextDouble();
		
		if (nota >=0 && nota <= 10 && nota2 >= 0 && nota2 <= 10) {
		} else { 
		System.out.println("Nota inserida é inválida, pois está fora da sequência permitida!");
			while(nota < 0 || nota > 10 || nota2 < 0 || nota2 > 10) {
				System.out.println("Escreva uma nota novamente: ");
				nota = sc.nextDouble();
				
				System.out.println("\nEscreva outra nota novamente: ");
				nota2 = sc.nextDouble();
			}
		}
		
		
		
		if((nota + nota2) / 2 >= 7 && (nota + nota2) / 2 <= 10) {
		System.out.println("\nO aluno foi aprovado! ");
		} else if((nota + nota2) / 2 < 7 && (nota + nota2) / 2 >=4 && (nota + nota2) / 2 <= 10) {
		System.out.println("\nO aluno está de recuperação! ");
		} else if ((nota + nota2) / 2 < 4 && (nota + nota2) / 2 >= 0 && (nota + nota2) / 2 <= 10) { 
		System.out.println("\nO aluno esta reprovado! ");
		}
		
		sc.close();
	}
}

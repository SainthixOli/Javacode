package Cap2;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O nuemro é par!");
		} else { 
			System.out.println("O numero é impar!");
		}
		
		System.out.println("\nFIM DO PROGRAMA!");
		
		sc.close();
	}
}

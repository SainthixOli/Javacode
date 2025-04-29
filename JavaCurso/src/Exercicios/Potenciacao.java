package Exercicios;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		double num = sc.nextDouble();
		
		double num2 = Math.pow(num, 2);
		double num3 = Math.pow(num, 3);
		
		System.out.printf("O resultado do numero elevado ao quadrado é: %.2f\n", num2);
		System.out.printf("O resultado do numero elevado ao cubo é: %.2f\n", num3);
		
		sc.close();
	}
}

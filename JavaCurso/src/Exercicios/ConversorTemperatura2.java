package Exercicios;

import java.util.Scanner;

public class ConversorTemperatura2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Variavel a ser alterada:
		System.out.println("Digite a temperatura em Celsius: ");
		double C = sc.nextInt();
		
		//Variaveis principais:
		final double v1 = 32; 
		final double v2 = 1.8;
		
		//(0 °C × 9/5) + 32 = 32 °F

		final double F = (C * v2)+v1;
		
		System.out.println("O valor disso em fahrenheit é: " + F);
		sc.close();
	}
}

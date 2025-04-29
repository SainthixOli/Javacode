//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

package Exercicios;
import java.util.Scanner;
public class ConversorTemperatura {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variavel a ser alterada:
		System.out.println("Digite a temperatura em fahrenheit: ");
		double F = sc.nextInt();
		
		//Variaveis principais:
		final double v1 = 32; 
		final double v2 = 5/9.0;
		final double C = (F - v1)*v2;
		
		System.out.println("O valor disso em Celsius é: " + C);
		sc.close();
	}

}

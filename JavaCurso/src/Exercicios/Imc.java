package Exercicios;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		//IMC = peso (kg) / [altura (m)]² 
		//Math.pow(x,y) --> elevar nuemro
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o seu peso em Kg: ");
		double peso = sc.nextDouble();
		
		System.out.println("Coloque a sua altura e metros: ");
		double altura = sc.nextDouble();
		
		double altura2 = Math.pow(altura, 2);
		double resultado = peso/altura2;
		
		System.out.printf("O seu imc é de: %.2f", resultado);
		
		sc.close();
	}
}
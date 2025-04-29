package Exercicios.operadores;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//A = b*h/2
	
	System.out.println("Qual é a base do trinagulo? ");
	double b = sc.nextDouble();
	
	System.out.println("\nQual a altura do triangulo? ");
	double h = sc.nextDouble();
	
	double a = b * h / 2;
	
	System.out.println("A área do trinagulo é: " + a);

	sc.close();
	}
}

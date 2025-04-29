package Exercicios;

import java.util.Scanner;

public class DesafioDeConversao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario do funcinario: ");
		String s1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario do funcinario: ");
		String s2 = sc.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario do funcinario: ");
		String s3 = sc.nextLine().replace(",", ".");
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double n3 = Double.parseDouble(s3);
		
		double soma = n1 + n2 + n3;
		
		System.out.println("\nA soma dos Salarios foi: " + soma);
		System.out.printf("\nA media salarial desses tres meses foi de %.2f ", soma / 3);
		sc.close();
	}
}

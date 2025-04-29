package Exercicios;

import java.util.Scanner;

public class DesafioFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Escreva o segundo numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Operaçao desejada: ");
		String operacao = sc.next();
		
		
		// Variáveis numéricas
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;

		// Resultado padrão
		double resultado = 0;

		// Lógica para associar operação ao resultado
		resultado = operacao.equals("+") ? soma : resultado;
		resultado = operacao.equals("-") ? subtracao : resultado;
		resultado = operacao.equals("*") ? multiplicacao : resultado;
		resultado = operacao.equals("/") ? divisao : resultado;

		// Imprime o resultado
		System.out.println("O resultado da operação é: " + resultado);
		
		sc.close();
		
		
		
		
	}
}

package Cap2;

import java.util.Scanner;

public class PrimoOuNao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		int n = sc.nextInt();		
		
		if(n % 1 == 0 && n % n == 0) { 
		System.out.println("O numero é primo! ");
		} else {
		System.out.println("O numero não é primo! ");
		}
		
		sc.close();
	}
}

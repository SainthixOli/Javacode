package Cap2;

import java.util.Scanner;

public class OutroJogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = 0;
		int soma = 0;
		
		while(num1 >= 0 ) {
			System.out.println("Escreva um numero: ");
			num1 = sc.nextInt();
			
			if (num1 < 0) {
				System.out.println("Este numero esta fora do intervalo permitido...");
				break;
			} 
			
			soma += num1;
		}
		
		System.out.println("A soma dos numeros é: " + soma);
		sc.close();
	}
}

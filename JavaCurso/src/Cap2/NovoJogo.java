package Cap2;

import java.util.Scanner;

public class NovoJogo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			int maiorNum = 0;
			
			for(int i = 0; i < 10; i++) {
			    System.out.println("Escreva um número: ");
			    num = sc.nextInt();
			    
			    if (maiorNum < num) {
			        maiorNum = num;
			    }
			}
		
		System.out.println("O mair numero é: " + maiorNum);
		   
		    sc.close();
		}
	}

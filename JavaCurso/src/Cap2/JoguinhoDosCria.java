package Cap2;

import java.util.Scanner;

public class JoguinhoDosCria {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 31;
		int contador = 0;
		
		
		double num2 = 0;
		
		while (true) { // Loop infinito, controlado pelo break
			System.out.println("Escreva um numero e veja se vc acertou...): ");
			num2 = sc.nextDouble();
            if (contador == 10) { // Condição para encerrar o loop
            	System.out.println("Vc atingiu o limite de tentativas.");
                break;
            } else if (num2 == num1) {
            	System.out.println("Voce acertou o numero");
            	break;
            }

            if (num2 >= 0 && num2 <= 100) { // Valida se a nota é válida
                
                contador++;       // Incrementa o contador de notas válidas
            } else {
                System.out.println("Numero inválida! Digite um numero entre 0 e 100.");
            }
        }
		
		
		
		
		sc.close();
	}
}

package Cap2;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva um ano: ");
        int ano = sc.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano é bissexto!");
        } else { 
            System.out.println("Ano não é bissexto!");
        }
        
        System.out.println("\nFim do programa!");
        sc.close();
    }
}
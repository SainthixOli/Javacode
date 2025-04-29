package Cap2;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um dia da semana: ");
		String dia = sc.next();
		
		if(dia.equals("domingo")) {
		System.out.println("O dia é 1");
		
		} else if(dia.equals("segunda")) {
		System.out.println("O dia é 2");	
		
		} else if(dia.equals("terca")) {
		System.out.println("O dia é 3");
		
		} else if(dia.equals("quarta")) {
		System.out.println("O dia é 4");
		
		} else if(dia.equals("quinta")) {
		System.out.println("O dia é 5");
		
		} else if(dia.equals("sexta")) {
		System.out.println("O dia é 6");
		
		} else if(dia.equals("sabado")) {
		System.out.println("O dia é 7");
		}
		
		sc.close();
		
	}
}

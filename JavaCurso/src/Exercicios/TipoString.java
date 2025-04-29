package Exercicios;

public class TipoString {
	public static void main(String[] args) {
		
		char classe;
		String nome = "Oliver";
		String sobrenome = "Arthur"; 
		var idade = 18;
		var salario = 12850.90;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha um salario de R$%.2f.", nome, sobrenome, idade, salario);
		
		if(salario >= 12000.00) {
			classe = 'A';
			
		} else {
			classe = 'B';
		}
	
		System.out.println("\n\nClasse salarial é: " + classe);
		
		salario = 10900.9;
		
		System.out.println("\n\nClasse salarial é: " + classe);
		
		System.out.println("Eu sou o Oliver");
	}

}

package Exercicios;

public class FormulaB {
	public static void main(String[] args) {
		//Delta = b^2 - 4ac
		//a = 1, b = 12 e c = -13
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double d = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("O reusultado é: " + d);
	}
}

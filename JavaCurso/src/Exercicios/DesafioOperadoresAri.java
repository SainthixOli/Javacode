package Exercicios;

public class DesafioOperadoresAri {
	 
	public static void main(String[] args) {
		
		//Primeira expressao
		double e11v = Math.pow((6 * (3 + 2)), 2);
		double e12v = 3 * 2;
		double r1 = e11v / e12v;
		
		//Segunda expressao
		double e21v = (1 - 5) * (2 - 7);
		int e22v = 2;
		double e23v = e21v / e22v;
		double r2 = Math.pow(e23v, 2);
		
		//Subtraindo as expressoes
		double s = r1 - r2;
		
		//Elevando as primeiras expressoes
		double resultado = Math.pow(s, 3);
		
		//Espressao de baixo 
		double e31v = Math.pow(10, 3);
		
		//Resolvendo toda expressao
		double resultado2 = resultado / e31v;
		
		System.out.println("A expressao ([6 * (3 + 2)]^2 / 3 * 2 - ((1 - 5) * (2 - 7) / 2)ˆ2 )^3 / 10^3 é igual a: " + s);
		System.out.println("A expressoa passa a ser: " + (int)resultado + "/" + (int)e31v);
		System.out.println("O resultado final é: " + (int)resultado2);
			
	}
}

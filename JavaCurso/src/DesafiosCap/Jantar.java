package DesafiosCap;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa paulo = new Pessoa("Paulo", 68.9);
		System.out.println(paulo.pessoaFormatacao());
		
		Comida c1 = new Comida("Arroz", 0.300);
		System.out.println("\n" + c1.comidaFormatacao());
		Comida c2 = new Comida("Feijao", 1.400);
		System.out.println("\n" + c2.comidaFormatacao() + "\n");
		
		paulo.comer(c1);
		paulo.comer(c2);
		
		System.out.println(paulo.apresentar());
		
		
		
	}
}

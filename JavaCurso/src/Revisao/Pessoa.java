package Revisao;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	static void saudaçao() {
		System.out.println("\nOlá, irei comer minha comida.\n");
	}
	
	void comerComida(Comida comida) {
		peso += comida.peso;
		System.out.printf("\n%s comeu %s!\n", nome, comida.nome);
	}

	void mostrarPeso() {
		System.out.printf("\nO peso da pessoa %s é igual a %.2f!\n", nome, peso);
	}
}

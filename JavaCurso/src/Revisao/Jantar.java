package Revisao;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa.saudaçao();
		
		Pessoa p1 = new Pessoa("Joao", 88.0);
		Comida arroz = new Comida("Arroz", 0.4);
		Comida feijao = new Comida("Feijao", 0.3);
		
		p1.mostrarPeso();
		
		p1.comerComida(feijao);
		p1.comerComida(arroz);
		
		p1.mostrarPeso();
		
		
		
	}
}

package Revisao.oo.composicao.desafio;

public class Teste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Jarisvaldo Antonuniester");
		
		Produto p1 = new Produto("Regua", 3.50);
		Produto p2 = new Produto("Borracha", 3.80);
		
		
		
		Item it1 = new Item(p1, 3);
		Item it2 = new Item(p2, 4);
		
		Compra cp1 = new Compra(c1);
		
		cp1.adicionarItens(it2);
		cp1.adicionarItens(it1);
		
		cp1.mostrarLista();
		
		c1.getValorTotal();
	}
}

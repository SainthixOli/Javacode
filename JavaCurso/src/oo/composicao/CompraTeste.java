package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra cp1 = new Compra();
		cp1.cliente = "Oliver Arthur";
		cp1.itens.add(new Item("Caneta", 3, 3.85));
		cp1.itens.add(new Item("Caderno", 2, 22.85));
		cp1.itens.add(new Item("MacBook Air M1", 1, 5899.90));
		
		System.out.println(cp1.obterValorTotal());
		
		
	}
}

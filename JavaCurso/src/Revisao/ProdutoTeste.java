package Revisao;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Caderno", 10.0);
		Produto p2 = new Produto("Caneta", 4.0);
		
		Produto.desconto = 0.50;
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		System.out.println(p1.precoDescontoGerente(0.50));
		System.out.println(p2.precoDescontoGerente(0.25));
		
		
		
		
		
		
	}
}

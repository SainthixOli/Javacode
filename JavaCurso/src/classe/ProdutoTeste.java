package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook OliverStack 2", 8790.50);
		
		
		var p2 = new Produto();
		p2.nome = "Combao de Caneta Azul 20 un.";
		p2.preco = 12.50;
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0);
		
		Produto.desconto = 0.30;
		
		System.out.printf("\nO preco final do Notebook é igual a: %.2f ", precoFinal1);
		System.out.printf("\nO preco final do Combao de caneta é igual a: %.2f", precoFinal2);
		
		
	}
}

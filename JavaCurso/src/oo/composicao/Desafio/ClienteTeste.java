package oo.composicao.Desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto produto11 = new Produto("Caneta", 1.00);
		Produto produto12 = new Produto("Lapis", 2.00);
		Produto produto13 = new Produto("Borracha", 1.00);
		Produto produto14 = new Produto("Caderno", 20.00);
		Produto produto21 = new Produto("Macbookm1", 5890.99);
		Produto produto22 = new Produto("Ipad", 6590.99);
		Produto produto23 = new Produto("Iphone 16", 15600.99);
		Produto produto24 = new Produto("Macbook m2", 8850.99);
		Produto produto25 = new Produto("Macbook Pro Max ", 27840.99);
		
		Item2 item11 = new Item2(produto11, 10);
		Item2 item12 = new Item2(produto12, 2);
		Item2 item13 = new Item2(produto13, 3);
		Item2 item14 = new Item2(produto14, 1);
		Item2 item21 = new Item2(produto21, 1);
		Item2 item22 = new Item2(produto22, 1);
		Item2 item23 = new Item2(produto23, 1);
		Item2 item24 = new Item2(produto24, 1);
		Item2 item25 = new Item2(produto25, 1);
		
		Compra listaDeCompra1 = new Compra();
		listaDeCompra1.itens.add(item11);
		listaDeCompra1.itens.add(item12);
		listaDeCompra1.itens.add(item13);
		listaDeCompra1.itens.add(item14);		

		Compra listaDeCompra2 = new Compra();
		listaDeCompra2.itens.add(item21);
		listaDeCompra2.itens.add(item22);
		listaDeCompra2.itens.add(item23);
		listaDeCompra2.itens.add(item24);
		listaDeCompra2.itens.add(item25);
		
		Compra listaDeCompra3 = new Compra();
		listaDeCompra3.adicionarItem(item11);
		
		Cliente c1 = new Cliente("Wallace");
		c1.adiconarACompra(listaDeCompra3);
		
		System.out.println(c1.obterValorTotalFormat());
		
		Cliente c2 = new Cliente("Oliver");
		c2.listaCompras.add(listaDeCompra2);
		
		System.out.println(c2.obterValorTotalFormat());
		
		
		
		
		
	}
}

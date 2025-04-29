package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	
	List<Compra> listaCompras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adiconarACompra(Compra compra) {
		this.listaCompras.add(compra);
	}
	
	double obterValorTotal(){
		
		double totalDoProduto = 0;
		double total = 0;
		
		for(Compra c : listaCompras) {
			for(Item2 i : c.itens) {
				
				totalDoProduto += i.quantidade * i.produto.preco;
			}
			total += totalDoProduto;
		}
	
	return total;
	}

	
	String obterValorTotalFormat(){
		
		double totalDoProduto = 0;
		Double total = 0.0;
		
		for(Compra c : listaCompras) {
			for(Item2 i : c.itens) {
				
				totalDoProduto += i.quantidade * i.produto.preco;
			}
			total += totalDoProduto;
		}
	
	return "\nO valor total da compra do(a) " + nome + " é igual a: R$" +  total.toString();
	}
}

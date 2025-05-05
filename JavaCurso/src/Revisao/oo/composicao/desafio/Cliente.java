package Revisao.oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
		
	}
	
	
	
	void getValorTotal() {
		double valortotal = 0;
		
		for (Compra compra : compras) {
			for (Item item : compra.itens) {
				
				valortotal += item.produto.preco * item.qntd;
			}
		} 
		System.out.println("R$" + valortotal);
	}
}

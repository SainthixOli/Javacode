package Revisao.oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final Cliente cliente;
	Item item;
	ArrayList<Item> itens = new ArrayList<>();
	
	Compra(Cliente cliente){
		this.cliente = cliente; 
		cliente.compras.add(this);
	}
	
	void adicionarItens(Item item) {
		this.item = item;
		itens.add(item); 
	}
	
	void mostrarLista() {
		System.out.println("A Compra é composta por...\n\n");
		for(Item item: itens) {
			System.out.println(item.toString() + "\n");
		}
	}
}

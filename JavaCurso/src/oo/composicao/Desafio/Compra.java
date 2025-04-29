package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item2> itens = new ArrayList<>();
	
	void adicionarItem(Item2 item) {
		this.itens.add(item);
	}
}

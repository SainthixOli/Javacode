package Revisao.oo.composicao.desafio;

public class Item {
	
	int qntd;
	Produto produto;
	
	Item(Produto produto, int qntd){
		this.qntd = qntd;
		this.produto = produto;
	}

	public String toString(){
		
		return "Quantidade: " + qntd + "\nProduto: " + produto.nome;
	}
}

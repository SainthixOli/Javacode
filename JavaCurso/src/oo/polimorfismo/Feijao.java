package oo.polimorfismo;

public class Feijao extends Comida {
	private double peso; //Isso tem como fazer pois está criando um nova variavel chamada peso.
	//private peso; => nao tem como fazer isso pois peso é protected na classe pai e vc esta deixando o seu nivel de encapsulamento maior do que a original.
	
	Feijao(double peso) {
		super(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;			
		}
	}
	//nao é necessario o get e set aqui pois ele herda tudo isso => apenas EXP
}

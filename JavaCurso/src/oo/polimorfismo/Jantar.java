package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.5);
		
		Arroz ig1 = new Arroz(0.2);
		Feijao ig2 = new Feijao(0.1);
		
		convidado.comer(ig1);
		convidado.comer(ig2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete doce = new Sorvete(0.2);
		
		convidado.comer(doce);
		System.out.println(convidado.getPeso());
	}
}

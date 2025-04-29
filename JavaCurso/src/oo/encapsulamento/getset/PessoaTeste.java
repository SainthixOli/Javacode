package oo.encapsulamento.getset;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Silva", 19);
		
		p1.setIdade(340 );
		
		System.out.println(p1);
	}
}

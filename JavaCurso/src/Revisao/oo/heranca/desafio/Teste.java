package Revisao.oo.heranca.desafio;

public class Teste {
	public static void main(String[] args) {
		
		Unin unin = new Unin(400);
		Ferrariada ferrari = new Ferrariada(350);
		
		System.out.println(unin.velocidadeAtl);
		System.out.println(ferrari.velocidadeAtl);

		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		
		
		unin.frear();
		unin.acelerar();
		unin.acelerar();
		unin.acelerar();
		unin.velocidadeAtl = 390;
		unin.acelerar();
		
		System.out.println(unin.velocidadeAtl);
		System.out.println(ferrari.velocidadeAtl);
	}
}

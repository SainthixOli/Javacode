package oo.heranca.desafio;

public class Uno extends Carro {
	
	public Uno() {
		this(200);
	}
	
	public Uno(int velocidadeMax) {
		super(velocidadeMax);
	}
	
	void visibilidade() {
		System.out.println(velocidadeAtual);
	}
	
	public void acelerar( ) {
		super.acelerar();
	}
	
	public void frear() {
		super.frear();
	}
	

}

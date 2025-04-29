package oo.heranca.desafio;

class Carro {
	protected final int velocidadeMax;
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > velocidadeMax) {
		velocidadeAtual = velocidadeMax;
		} else {
			velocidadeAtual += delta;			
		}
	}
			
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A VELOCIDADE ATUAL É IGUAL A => " + velocidadeAtual + "Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}

package Revisao.oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAX;
	int velocidadeAtl = 0;
	int delta = 5;
	
	Carro(int velocidadeMax){
		this.VELOCIDADE_MAX = velocidadeMax;
		
	}
	
	void acelerar() {
		if(velocidadeAtl + delta > VELOCIDADE_MAX) {
			velocidadeAtl = VELOCIDADE_MAX;
		} else {
			velocidadeAtl += 15;			
		}
	}
	
	
	void frear() {
		if(velocidadeAtl >= 0) {
			velocidadeAtl -= 15;
		}
	}
}

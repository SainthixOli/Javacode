package Revisao.oo.heranca.desafio;

public class Unin extends Carro {
	int delta = 20;
	
	Unin(){
		this(400);
		delta = 15;
	}
	
	Unin(int velocidademax){
		super(velocidademax);
		delta = 15;
	}
	
	void acelerar() {
		
		if(velocidadeAtl + delta > VELOCIDADE_MAX) {
			velocidadeAtl = this.VELOCIDADE_MAX;
		} else {
			
			velocidadeAtl += 20;
		}
	}

	
	void frear() {
		if(velocidadeAtl > 0) {
			
			velocidadeAtl -= 20;
		}
	}
}
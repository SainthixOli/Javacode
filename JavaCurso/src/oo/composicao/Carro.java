package oo.composicao;

public class Carro {
	Motor motor;
	
	//Carro cria um motor e passa o proprio carro pra ser parametro do motor
	Carro() {
		this.motor = new Motor(this);		
	}
	
	void acelerar() {
		if(motor.fatorDeInjecao < 2.6) {
			motor.fatorDeInjecao += 0.4;			
		}
	}

	void frear() {
		if(motor.fatorDeInjecao > 0.5)
		motor.fatorDeInjecao -= 0.4;
	}

	void ligarCarro() {
		motor.ligado = true;
	}
	
	void desligarCarro() {
		motor.ligado = false;
	}
	
	boolean ligadoOuNao() {
			return motor.ligado;
	}
	
	
}

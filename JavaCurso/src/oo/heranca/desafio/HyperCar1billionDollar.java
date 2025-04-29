package oo.heranca.desafio;

public class HyperCar1billionDollar extends Carro implements Esportivo {
	
	
	
	public HyperCar1billionDollar() {
		this(900);
	}
	
	public HyperCar1billionDollar(int velocidadeMax) {
		super(velocidadeMax);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
	setDelta(35);
	}
	
	@Override
	public void desligarTurbo() {
		setDelta(15);
	}
}

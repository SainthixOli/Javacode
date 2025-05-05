package oo.composicao;

public class Motor {
	Carro carro;
	boolean ligado = false;
	double fatorDeInjecao = 1;
	
	//Motor depende de um carro para existir; O carro que cria o motor dele mesmo;
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorDeInjecao * 3000);			
		}
		
	}
}

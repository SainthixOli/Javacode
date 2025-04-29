package DesafiosCap;

public class Pessoa {
	
	String nome;
	double peso;
	double pesoTotal;
	//double p;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	String pessoaFormatacao() {
		String formatado = "Nome = %s \nPeso = %f";
		return String.format(formatado, nome, peso);
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return String.format("Peso atual: %.2f Kgs.", peso);
	}
}
package DesafiosCap;

public class Comida {

	String nome;
	double pesoComida;
	
	Comida(String nome, double peso) {
		this.nome = nome;
		this.pesoComida = peso;
	}
	
	String comidaFormatacao() {
		String formatado = "Nome = %s \nPeso =  %.3f";
		return String.format(formatado, nome, pesoComida);
	
	}

}

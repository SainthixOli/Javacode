package oo.encapsulamento.getset;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	
	 Pessoa(String nome, String sobreNome, int idade) {
		 this.nome = nome;
		 this.sobreNome = sobreNome;
		 this.idade = idade;
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}
	 
	public String toString() {
	return "Meu nome é " + getNomeCompleto() + " e tenho " + getIdade() + " de idade";
	}
	 
	 
}

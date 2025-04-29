package Revisao.Array;

public class User {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		User outro = (User) objeto;
		
		if(objeto instanceof User) {
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return emailIgual && nomeIgual;
		} else {
			return false;
		}
	}
}

package classe;

public class Usuario {
	String nome;
	String email;
	

	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
		
		Usuario outro = (Usuario) obj;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		if(nomeIgual == true && emailIgual == true) {
			System.out.println("Ha dois usuarios iguais na lista!\n");
		}
		return nomeIgual && emailIgual;
		} else {
		return false;
		}
	}
}


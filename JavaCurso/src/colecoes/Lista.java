package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Arthur");
		
		lista.add(u1);
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Natalia"));
		
		System.out.println(lista.get(0)); //acessa apartir do indice. 
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
		
	}
}

package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
	
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.push("A maconha como plata medecinal... Mitos e verdades!");
		livros.push("A grande catucada que dei no cu del rei");
		livros.push("Manifesto do partido comunista");
		livros.push("A grande depressao de amelia bispa");
		livros.push("Breno Machado a historia. Do começo ao fim");
		livros.push("Comando unico: tudo que voce precisa saber, desde de sua estrutura ate outras coisas");
	
		for(String livro: livros) {
			System.out.println(livro);
		}
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
		
		System.out.println("\n" + livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.pop());
//		System.out.println(livros.pop());
//		System.out.println(livros.pop());
//		System.out.println(livros.poll());
//		System.out.println(livros.poll());
		
	}
}

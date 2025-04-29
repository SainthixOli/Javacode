package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer a Add -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana"); //Lança uma exceção 
		fila.offer("Bia"); // Retorna false
		fila.add("Carlinho");
		fila.add("Jose da Pinga");
		fila.offer("Ze preto da Baixada");
		fila.add("Bahiano da Maconha");
		fila.add("Maikin do Pó");
		
		//Peek a Element -> Obter proximo elemento da fila (sem remover)
		//Diferença é o comportamento ocorre quando a fila está vazia!
		
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.element()); //Lança uma exceção
		System.out.println(fila.element()); 
		
		
		//Poll a Remove -> Obter proximo elemento da fila (removendo)
		
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.poll()); //retorna exceção
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

	}
}

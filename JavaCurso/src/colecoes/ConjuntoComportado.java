package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		SortedSet <String> lista = new TreeSet<>();
		
		lista.add("Marcos");
		lista.add("Lucas");
		lista.add("Oliver");
		lista.add("Nicole");
		lista.add("Jason");
		lista.add("Ana");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(100);
		nums.add(2980);
		nums.add(15900);
		nums.add(18900);
		nums.add(8000);
		
		for(int n: nums) {
			System.out.println("\n" + n);
		}
	}
	
}

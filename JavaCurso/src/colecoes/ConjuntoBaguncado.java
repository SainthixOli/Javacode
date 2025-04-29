package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add(1);
		conjunto.add("Minha pomba");
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		System.out.println(conjunto);
		
		conjunto.add(1);
		conjunto.add("MInha Pomba");
		
		System.out.println(conjunto.size());
		System.out.println(conjunto);
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		System.out.println(conjunto.remove("aiin"));
		System.out.println(conjunto.remove("Minha pomba"));
		
		System.out.println(conjunto);
		System.out.println(conjunto.contains(1));
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		
		
	}
}

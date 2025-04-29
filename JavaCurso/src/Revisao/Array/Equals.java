package Revisao.Array;

public class Equals {
	public static void main(String[] args) {
		
		
		User u1 = new User();
		u1.nome = "Oliver";
		u1.email = "olover@gmail.com";
		
		User u2 = new User();
		u2.nome = "Oliver";
		u2.email = "olover@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
	}
}

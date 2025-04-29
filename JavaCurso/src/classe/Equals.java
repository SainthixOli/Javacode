package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Oliver";
		u1.email = "oliverzada@algumemail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Oliver";
		u2.email = "oliverzada@algumemail.com";
		
		
		System.out.println(u1.equals(u2));
		
	}
}

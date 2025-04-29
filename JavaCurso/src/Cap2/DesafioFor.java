package Cap2;

public class DesafioFor {
	public static void main(String[] args) {
		  
		String palavraComparacao = "iiiii";  // A string com a quantidade de letras para comparação
		String valor = "#";
	   
		for(String i = "i" ;i.length() <= palavraComparacao.length(); i += "i") {
	    	System.out.println(valor);
	    	valor += "#";
	    }
	}
}

package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
	//dia = 01;
	//mes = 01;
	//ano = 1970;
	this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes ;		
		this.ano = ano;		
	}
	
	String obterDataFormatada1() {
		return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
	}

	String obterDataFormatada2() {
		final String formato = "%d/%d/%d";
		return String.format(formato  , dia, mes, ano);
	}
	
	
}

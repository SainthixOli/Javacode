package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		
		Data d1 = new Data(10, 01, 2025);
		d1.dia = 10;
		d1.mes = 01;
		d1.ano = 2025;
		
		Data d2 = new Data(19, 02, 2006);
		d2.dia = 19;
		d2.mes = 02;
		d2.ano = 2025;
		
		Data d3 = new Data();
		
		String dataAtual1 = d1.obterDataFormatada1();
		String dataAniversario1 = d2.obterDataFormatada1();
		
		String dataAtual2 = d1.obterDataFormatada2();
		String dataAniversario2 = d2.obterDataFormatada2();
		String dataPadrao = d3.obterDataFormatada2();
		
		
		System.out.println("Data atual: " + dataAtual1);
		System.out.println("Data de anireversario: " + dataAniversario1);
		
		System.out.println("\nData atual: " + dataAtual2);
		System.out.println("Data de anireversario: " + dataAniversario2);
		System.out.println(dataPadrao);
		
	
	}
}

package Exercicios.operadores;

public class Tenarios {
	public static void main(String[] args) {
		
		double media = 6.0;
		String resultado = media >= 6.0 ? "Aprovado." : "Reprovado.";
		
		System.out.println("O alnuno está aprovado ou reprovado? " + resultado);
		
		double nota = 9.5;
		boolean media2 = nota >=6;
		boolean bomComportamento = true;
		boolean temDesconto = media2 && bomComportamento;
		String resultado2 = temDesconto ? "Sim." : "Não.";
		
		System.out.println("O aluno Oliver tem desconto? " + resultado2);
	}
}

package Exercicios;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nome, sobrenome;
        int idade;
        double salario;
        
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Insira seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.print("Insira sua idade: ");
        idade = scanner.nextInt();
        
        // Lê o salário como uma string e substitui a vírgula por ponto, se necessário
        System.out.print("Escreva seu salario desejado: ");
        String salarioInput = scanner.next();
        salarioInput = salarioInput.replace(',', '.'); // Substitui vírgula por ponto
        salario = Double.parseDouble(salarioInput);
        
        System.out.printf("O senhor %s %s tem %d anos e ganha um salário de R$%.2f.%n", nome, sobrenome, idade, salario);
        
        scanner.close();
    }
}
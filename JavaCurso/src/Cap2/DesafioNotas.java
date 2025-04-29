package Cap2;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;      // Soma das notas
        double contador = 0;  // Contador de quantas notas foram inseridas

        while (true) { // Loop infinito, controlado pelo break
            System.out.println("Escreva uma nota (ou digite -1 para sair): ");
            double novaNota = sc.nextDouble();

            if (novaNota == -1) { // Condição para encerrar o loop
                break;
            }

            if (novaNota >= 0 && novaNota <= 10) { // Valida se a nota é válida
                nota += novaNota; // Soma a nota
                contador++;       // Incrementa o contador de notas válidas
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        }

        // Após o loop, calcula e exibe a média
        if (contador > 0) { // Verifica se houve notas válidas
            double media = nota / contador;
            System.out.printf("A soma das notas é: %.2f%n", nota);
            System.out.printf("A média das notas é: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        sc.close();
    }
}
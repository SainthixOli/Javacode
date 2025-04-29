package Exercicios;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        
        // Valor int
        Integer n1 = 10000;
        System.out.println(n1.toString().length());
    
        var n2 = 10;
        
        // Mesmo com o toString ele volta a ser int 
        var soma = n1 + n2;
        
        // String para número
        System.out.println("O valor da soma de n1 e n2 é: " + soma);
        
        String v1 = "100";
        String v2 = "200";
        
        System.out.println(v1 + v2);
        
        // Transformando String em número int
        int i1 = Integer.parseInt(v1);
        int i2 = Integer.parseInt(v2);
        
        // Somando
        System.out.println(i1 + i2);
        
        // Abre uma janelinha interativa
        String valor1 = JOptionPane.showInputDialog("Insira o Primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Insira o Segundo número: ");
        
        // Passando valor para double
        double valor3 = Double.parseDouble(valor1);
        double valor4 = Double.parseDouble(valor2);
        
        double soma2 = valor3 + valor4;
        
        // Exibindo os resultados em caixas de diálogo
        JOptionPane.showMessageDialog(null, "A soma dos valores é igual a: " + soma2);
        JOptionPane.showMessageDialog(null, "A média dos valores é igual a: " + soma2 / 2);
    }
}
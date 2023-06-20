package fundamentos.br.com.coder.estruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número: "); // Traz uma janela pop-up para inserir determinado valor

        int numero = Integer.parseInt(valor); // Converte uma string em um valor numérico inteiro e armazena esse valor na variável numero

        if(numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}

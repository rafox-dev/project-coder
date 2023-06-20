package fundamentos.br.com.coder.estruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");

        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if(nota >= 8.1) {
            System.out.println("Conceito A");
        } else if(nota >= 6.1) {
            System.out.println("Conceito B");
        } else if(nota >= 4.1) {
            System.out.println("Conceito C");
        } else if(nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
    }
        System.out.println("FIM!");
        entrada.close();
    }
}
// Ai percorrer as linhas de "if" e "else" do código é verificado se o valor retorna "true" OU "false"
// No momento em que o bloco retorna "true", o restante é desconsiderado.

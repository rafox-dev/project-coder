package fundamentos.br.com.coder.estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o dia da semana: ");
        String valor = entrada.next();

        if(valor.equals("Domingo")) { // Outra opção seria usar o .equalsIgnoreCase que desconsidera caso o usuário digite letra maiúscula ou minúscula
            System.out.println("1");
        } else if (valor.equals("Segunda")) {
            System.out.println("2");
        } else if (valor.equals("Terça")) {
            System.out.println("3");
        } else if (valor.equals("Quarta")) {
            System.out.println("4");
        } else if (valor.equals("Quinta")) {
            System.out.println("5");
        } else if (valor.equals("Sexta")) {
            System.out.println("6");
        } else if (valor.equals("Sábado")) {
            System.out.println("7");
        }
        entrada.close();

        // Outra maneira de fazer comparação entre Strings
        if("Domingo".equalsIgnoreCase(valor)) {
            System.out.println("1");
        }
    }
}

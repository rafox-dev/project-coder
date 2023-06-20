package fundamentos.br.com.coder.estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = "";

        while (!frase.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            frase = entrada.nextLine();
        }
        entrada.close();
    }
}
// Diferente do While determinado, o indeterminado irá ser executado até alguma ação bloquear sua execução
package fundamentos.br.com.coder.estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    String texto = "";

        do {
            System.out.println("Se deseja sair, digite: Quero sair\n");
            System.out.print("Insira nomes que você daria a seus filhos...");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("Quero sair")); // Continua repetindo enquanto 'texto' for diferente de "Quero sair" (ignorando maiúsculas e minúsculas)
            System.out.println("Obrigado!");

    entrada.close();
    }
}
// O do-while é uma estrutura de controle em Java que permite executar repetidamente um bloco de código pelo menos uma vez
// O do-whilw verifica uma condição para decidir se o bloco de código deve ser executado novamente ou se deve ser encerrado.

// do {
//    // Bloco de código a ser executado
// } while (condição);


// O bloco de código dentro do do é executado pelo menos uma vez, independentemente da condição especificada. Isso ocorre porque a verificação da condição ocorre no final do laço.
// Após a execução do bloco de código, a condição especificada no while é verificada. Se a condição for verdadeira, o bloco de código será executado novamente. Caso contrário, o laço será encerrado e a execução continua após o while.
// A condição especificada no while é uma expressão booleana que determina se o bloco de código será executado novamente. Se a condição for verdadeira, o laço continua; caso contrário, o laço é encerrado.
// O do-while é útil quando você precisa executar um bloco de código pelo menos uma vez, independentemente da condição, e, em seguida, repetir a execução com base em uma condição específica.
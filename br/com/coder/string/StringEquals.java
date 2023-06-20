package fundamentos.br.com.coder.string;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        //Forma correta
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // Usando o next ele desconsidera ESPAÇOS, já o NEXTLINE irá CONSIDERAR ESPAÇOS caso sejam inseridos pelo usuário
        System.out.println("2" == s2); // Comparando se "2" equivale a "s2" - maneira ERRADA de comparar
        System.out.println("2".equals(s2.trim())); // Comparando se "2" equivale a "s2" - maneira CORRETA de comparar
        // O uso do "trim" é somente para desconsiderar os ESPAÇOS caso seja digitado pelo usuário
        entrada.close();

    }
}
// String deve ser comparada usando o EQUALS, e não o ==.
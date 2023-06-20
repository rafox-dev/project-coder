package fundamentos.br.com.coder.operadores;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 5 > 8;

        System.out.println(condicao1 && condicao2); // FALSE
        System.out.println(condicao1 || condicao2); // TRUE
        System.out.println(condicao1 ^ condicao2); // TRUE
        System.out.println(!condicao1 ); // FALSE
        System.out.println(!condicao2); // TRUE
        System.out.println(condicao1 && !condicao2); // TRUE

        System.out.println("\nTabela verdade &&"); // E (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true); // FALSE e qualquer coisa, o resultado sempre será FALSE.
        System.out.println(false && false);

        System.out.println("\nTabela verdade ||"); // OU (OR)
        System.out.println(true || true); // TRUE ou qualquer coisa, o resultado sempre será TRUE.
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade ^ EXCLUSIVO"); // OU EXCLUSIVO (XOR)
        System.out.println(true ^ true); // TRUE ou qualquer coisa, o resultado sempre será TRUE.
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT"); // ! NEGAÇÃO, se é TRUE, vira FALSO. E vice-versa.
        System.out.println(!true);
        System.out.println(!false);

    }
}

package fundamentos.br.com.coder.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // Equivale a: a = a + 1
        a--; // Equivale a: a = a - 1

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio...");
        System.out.println(++a == b--); // O operador antes do operando, como o ++A tem prioridade, ja o operando seguido do operador B++ vem em seguida.
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
// Na linha 18, como o operando está com prioridade maior, ele irá incrementar primeiro, pra depois comparar.
// Quando o operador vem depois da variavel ele é PÓS FIXADO, quando vem antes é PRÉ FIXADO.
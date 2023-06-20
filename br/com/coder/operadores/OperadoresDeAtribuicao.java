package fundamentos.br.com.coder.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        // Formas de atribuir uma variável a outra sem repeti-lá, equivalentes ao lado nos comentários.
        c += b; // c = c + b
        c -= a; // c = c - b
        c *= b; // c = c * b
        c /= a; // c = c / a;

        c++; // c = c +1; // Operador unário de auto incremento, interpretado pelo Java.

        System.out.println(c);

        c %= 2; // c = c % 2; // Retorna 0 ou 1. Se for 0 ele é PAR, se for 1 ele é ÍMPAR.

        System.out.println(c);

    }
}
// Qualquer número divido por 2 o resto da divisão é 0
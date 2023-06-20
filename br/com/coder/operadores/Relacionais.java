package fundamentos.br.com.coder.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';
        // Cada letra em Java é associada a um número da tabela unicode
        // Operadores de comparação == fica sempre ao meio dos operandos
        // Operadores de comparação sempre retornarão TRUE ou FALSE
        System.out.println(a == b);

        System.out.println(5 > 10);
        System.out.println(5 >= 5);
        System.out.println(5 < 10);
        System.out.println( 30 <= 10);
        System.out.println(30 != 10);

        double nota = 6.5;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 10;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}

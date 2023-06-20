package fundamentos.br.com.coder.operadores;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV40 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador unário
        boolean souSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 40\"? " + comprouTV40);
        System.out.println("Comprou Sorvete? " + comprouSorvete);
        System.out.println("Sou saudável! " + souSaudavel);

    }
}

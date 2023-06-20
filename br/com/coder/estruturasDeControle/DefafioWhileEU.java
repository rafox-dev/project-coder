package fundamentos.br.com.coder.estruturasDeControle;


import java.util.Scanner;

public class DefafioWhileEU {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double quantidadaDeNotas = 0;
        double totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Insira uma nota válida de 0 a 10");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                totalDeNotas += nota;
                quantidadaDeNotas++;
            } else if (nota != -1) {
                System.out.println("Fim do while");
            }
        }
        double media = totalDeNotas / quantidadaDeNotas;
        System.out.println("A média das notas é: " + media);

        entrada.close();
    }
}

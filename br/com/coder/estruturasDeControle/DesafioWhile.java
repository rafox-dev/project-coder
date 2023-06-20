package fundamentos.br.com.coder.estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double quantidadeDeNotas = 0;
        double totalDeNotas = 0;

        while (nota != -1) { // Equanto o usuário não digitar "-1" o while continuará a ser executado
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

        if (nota <= 10 && nota >= 0) {
            totalDeNotas += nota; // "totalDeNotas" recebe o que está em "nota" e vai incrementando essas notas inseridas a variável "totalDeNotas"
            quantidadeDeNotas++; // "quantidadeDeNotas" é incrementada em 1 a cada vez que uma nota válida é inserida pelo usuário
        } else if (nota != -1){
            System.out.println("Nota inválida!");
        }
    }
        // Calcular a média
        double media = totalDeNotas / quantidadeDeNotas;
        System.out.println("A média das notas inseridas é: " + media);

        entrada.close();
    }
}
// Por exemplo, se o usuário inserir três notas válidas, o valor de quantidadeDeNotas será incrementado três vezes.
// Resulta no valor final à quantidade de notas válidas inseridas pelo usuário
// "totalDeNotas += nota;" significa que o valor da variável "nota" será somado ao "totalDeNotas".
// Isso acumula as notas válidas inseridas na variável "totalDeNotas".
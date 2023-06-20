package fundamentos.br.com.coder;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double numA = Math.pow(6 * (3 + 2), 2);
        // Calcula o valor de numA: 6 * (3 + 2) elevado ao quadrado
        double denA = 3 * 2;
        // Define o valor de denA como 3 * 2
        double numB = (1 - 5) * (2 - 7);
        // Calcula o valor de numB: (1 - 5) multiplicado por (2 - 7)
        double denB = 2;
        // Define o valor de denB como 2
        double superiorA = numA / numB;
        // Calcula o valor de superiorA: numA dividido por numB
        double superiorB = Math.pow(numB / denB, 2);
        // Calcula o valor de superiorB: (numB dividido por denB) elevado ao quadrado
        double superior = Math.pow(superiorA - superiorB, 3);
        // Calcula o valor de superior: (superiorA - superiorB) elevado ao cubo
        double inferior = Math.pow(10, 3);
        // Define o valor de inferior como 10 elevado ao cubo
        double resultado = superior / inferior;
        // Calcula o valor de resultado: superior dividido por inferior

        System.out.println("O resultado é: " + resultado);
        // Imprime o resultado na tela
    }

}

// O Math.pow é um método da classe Math em Java que é usado para elevar um número a uma determinada potência.
// O Math.pow possui dois parâmetros: o primeiro é o número que será elevado e o segundo é o expoente ao qual o número será elevado.
// Na linha 5: double numA = Math.pow(6 * (3 + 2), 2);, o Math.pow é usado para elevar o resultado da expressão 6 * (3 + 2) ao quadrado.
// Na linha 15: double superiorB = Math.pow(numB / denB, 2);, o Math.pow é utilizado para elevar a expressão numB / denB ao quadrado.
// Na linha 17: double superior = Math.pow(superiorA - superiorB, 3);, o Math.pow é utilizado para elevar a diferença entre superiorA e superiorB ao cubo.
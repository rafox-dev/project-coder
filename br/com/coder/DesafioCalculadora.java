package fundamentos.br.com.coder;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
    public class DesafioCalculadora {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);  // Cria um objeto Scanner chamado "entrada" para ler a entrada do usuário.

            System.out.println("insira o primeiro número: ");  // Imprime a mensagem solicitando ao usuário que insira o primeiro número.
            double num1 = entrada.nextDouble();  // Lê o próximo número do usuário e armazena na variável "num1" como um valor double.

            System.out.println("Insira o segundo número: ");  // Imprime a mensagem solicitando ao usuário que insira o segundo número.
            double num2 = entrada.nextDouble();  // Lê o próximo número do usuário e armazena na variável "num2" como um valor double.

            System.out.println("Qual operação você deseja fazer? ");  // Imprime a mensagem solicitando ao usuário que escolha a operação desejada.
            String op = entrada.next();  // Lê a próxima entrada do usuário e armazena em uma variável "op" como uma string.

            // Lógica para fazer a operação
            double resultado = "+".equals(op) ? num1 + num2 : 0;  // Se "op" for igual a "+", o valor de "resultado" será a soma de "num1" e "num2". Caso contrário, o valor será 0.
            resultado = "-".equals(op) ? num1 - num2 : resultado;  // Se "op" for igual a "-", o valor de "resultado" será a subtração de "num1" e "num2". Caso contrário, o valor permanece o mesmo.
            resultado = "*".equals(op) ? num1 * num2 : resultado;  // Se "op" for igual a "*", o valor de "resultado" será a multiplicação de "num1" e "num2". Caso contrário, o valor permanece o mesmo.
            resultado = "/".equals(op) ? num1 / num2 : resultado;  // Se "op" for igual a "/", o valor de "resultado" será a divisão de "num1" por "num2". Caso contrário, o valor permanece o mesmo.
            resultado = "%".equals(op) ? num1 % num2 : resultado;  // Se "op" for igual a "%", o valor de "resultado" será o resto da divisão de "num1" por "num2". Caso contrário, o valor permanece o mesmo.

            System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);  // Imprime o resultado formatado com duas casas decimais.
            entrada.close();  // Fecha o objeto Scanner.
    }
}

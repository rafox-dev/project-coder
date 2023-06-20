package fundamentos.br.com.coder.operadores; // Declaração do pacote "fundamentos"

public class Aritmeticos { // Declaração da classe "Aritmeticos"
	
	public static void main(String[] args) { // Método principal da classe
		
		System.out.println(2 + 3); // Imprime o resultado da adição de 2 e 3
		
		var x = 24.56; // Declaração da variável "x" como um valor decimal
		double y = 2.2; // Declaração da variável "y" como um valor decimal
		
		System.out.println(x + y); // Imprime o resultado da adição de x e y
		System.out.println(x - y); // Imprime o resultado da subtração de x por y
		System.out.println(x * y); // Imprime o resultado da multiplicação de x por y
		System.out.println(x / y); // Imprime o resultado da divisão de x por y
		
		int a = 8; // Declaração da variável "a" como um valor inteiro
		int b = 3; // Declaração da variável "b" como um valor inteiro
		
		System.out.println(a + b); // Imprime o resultado da adição de a e b
		System.out.println(a - b); // Imprime o resultado da subtração de a por b
		System.out.println(a * b); // Imprime o resultado da multiplicação de a por b
		System.out.println(a / b); // Imprime o resultado da divisão inteira de a por b
		System.out.println(a / (double) b); // Imprime o resultado da divisão de a por b, com conversão de b para double
		System.out.println(a / (float) b); // Imprime o resultado da divisão de a por b, com conversão de b para float
		
		System.out.println(a % b); // Imprime o resto da divisão de a por b
		System.out.println(8 % 3); // Imprime o resto da divisão de 8 por 3
		
		System.out.println(x + y - a * b); // Imprime o resultado da expressão x + y - a * b
	}
}

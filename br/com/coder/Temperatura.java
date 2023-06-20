package fundamentos.br.com.coder;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + " ºC");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + " ºC");
		
	}

}

// Nesse código, temos dada a fórmula na linha 6 que é usada para calcular a conversão de ºF para ºC
// Na linha 7 e 8 definimos os tipos, nomes e valores das variáveis
// Na linha 10 definimos também um tipo, nome e o valor da variável fahrenheit
// Na linha 11 definimos o tipo, nome, e o valor da variável que será o resultado da fórmula que ela está recebendo
// Também na linha 11, como na 15, estamos dizendo que a valor armazenado na variável CELSIUS será o valor de FAHRENHEIT 86 menos o valor de AJUSTE 32 vezes o resultado que armazenou na variável FATOR 0.5555...
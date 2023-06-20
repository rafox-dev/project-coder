package fundamentos.br.com.coder;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4; // Definindo a variável raio do tipo double, atribuindo a ela o valor de "3.4".
		final double PI = 3.14159; // O uso do "final" antes do tipo da variável, significa que o valor de PI atribuído nele será imutável, não pode ser mudado.
		
		double area = PI * raio * raio; // Fórmula usada para fazer o cálculo do valor que a variável area irá receber 
		System.out.println(area);
		
		raio = 10; // Definindo um novo valor a variável raio
		area = PI * raio * raio;
		System.out.println("Area = " + area + " m2"); // Concatenando o que será impresso no console
	}

}
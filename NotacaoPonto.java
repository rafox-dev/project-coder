package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Foco e determinação"; // Declaração de uma variável do tipo String e atribuição de um valor literal
		
		// Abaixo alguns exemplos de funções para uso do tipo String //
		
		s = s.replace("determinação", "Perseverança"); // Uso do método replace() para substituir a palavra "determinação" por "Perseverança"
		s = s.toUpperCase(); // Uso do método toUpperCase() para converter todos os caracteres da String em maiúsculas
		s = s.concat("!"); // Uso do método concat() para concatenar um ponto de exclamação ao final da String
		
		System.out.println(s); // Impressão do valor armazenado na variável s
		
		String r = "Rafael".toUpperCase(); // Declaração de uma variável do tipo String com um valor literal, transformando todos os caracteres em maiúsculas
		System.out.println(r); // Impressão do valor armazenado na variável r
		
		String y = "Bom dia X".replace("X", "Rafael").concat("!"); // Declaração de uma variável do tipo String com um valor literal, substituindo a letra "X" por "Rafael" e concatenando um ponto de exclamação
		System.out.println(y); // Impressão do valor armazenado na variável y
	}
}

// O uso do operador "." somente é válido para tipo String, tipos primitivos não é aceito.
package fundamentos; // Define o pacote ao qual a classe pertence

import java.util.Scanner; // Importa a classe Scanner do pacote java.util

public class DesafioConversao { // Declaração da classe pública DesafioConversao
	
	public static void main(String[] args) { // Método principal main, ponto de entrada do programa
		
		Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner chamado 'entrada' para ler dados do teclado (System.in)
		
		System.out.println("Informe o primeiro salário: ");
		String val1 = entrada.next().replace(",", "."); // Lê uma palavra do teclado, substitui todas as vírgulas por pontos e armazena o resultado na variável 'val1'
		
		System.out.println("\nInforme o segundo salário: ");
		String val2 = entrada.next().replace(",", "."); // Lê uma palavra do teclado, substitui todas as vírgulas por pontos e armazena o resultado na variável 'val2'
		
		System.out.println("\nInforme o terceiro salário: ");
		String val3 = entrada.next().replace(",", "."); // Lê uma palavra do teclado, substitui todas as vírgulas por pontos e armazena o resultado na variável 'val3'
		
		double salario1 = Double.parseDouble(val1); // Converte a String 'val1' em um valor do tipo double usando o método estático parseDouble() da classe Double
		double salario2 = Double.parseDouble(val2); // Converte a String 'val2' em um valor do tipo double usando o método estático parseDouble() da classe Double
		double salario3 = Double.parseDouble(val3); // Converte a String 'val3' em um valor do tipo double usando o método estático parseDouble() da classe Double
		
		double media = (salario1 + salario2 + salario3) / 3; // Calcula a média dos valores 'salario1', 'salario2' e 'salario3' e armazena o resultado na variável 'media'
		System.out.println("A média de salários é: " + media); // Imprime o valor da variável 'media' no console
		
		entrada.close(); // Fecha o objeto Scanner 'entrada' para liberar recursos
	
	} // Fim do método main

} // Fim da classe DesafioConversao

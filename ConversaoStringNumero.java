package fundamentos; // Define o pacote ao qual a classe pertence

import javax.swing.JOptionPane; // Importa a classe JOptionPane do pacote javax.swing para uso de caixas de diálogo

public class ConversaoStringNumero { // Declaração da classe pública ConversaoStringNumero
	
	public static void main(String[] args) { // Método principal main, ponto de entrada do programa
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número"); // Exibe uma caixa de diálogo para entrada de texto e armazena o valor inserido como String na variável 'valor1'
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número"); // Exibe uma caixa de diálogo para entrada de texto e armazena o valor inserido como String na variável 'valor2'
		
		System.out.println(valor1 + valor2); // Imprime a concatenação das Strings 'valor1' e 'valor2' no console
		
		double numero1 = Double.parseDouble(valor1); // Converte a String 'valor1' em um valor do tipo double usando o método estático parseDouble() da classe Double
		double numero2 = Double.parseDouble(valor2); // Converte a String 'valor2' em um valor do tipo double usando o método estático parseDouble() da classe Double
		
		double soma = numero1 + numero2; // Calcula a soma dos valores 'numero1' e 'numero2' e armazena o resultado na variável 'soma'
		System.out.println("Soma é: " + soma); // Imprime o valor da variável 'soma' no console
		System.out.println("Média é: " + soma / 2); // Calcula a média dos valores 'numero1' e 'numero2' e imprime o resultado no console
		
	} // Fim do método main

} // Fim da classe ConversaoStringNumero

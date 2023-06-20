package fundamentos.br.com.coder; // Define o pacote ao qual a classe pertence

public class ConversaoTipoPrimitivoNumerico { // Declaração da classe pública ConversaoTipoPrimitivoNumerico
	
	public static void main(String[] args) { // Método principal main, ponto de entrada do programa
		
		double a = 1; // Atribui o valor 1 a variável 'a' do tipo double, com conversão implícita (CAST) de int para double
		System.out.println(a); // Imprime o valor da variável 'a' no console
		
		float b = (float) 1.123456788888; // Atribui o valor 1.123456788888 a variável 'b' do tipo float, com conversão explícita (CAST) de double para float
		System.out.println(b); // Imprime o valor da variável 'b' no console
		
		int c = 130; // Atribui o valor 130 à variável 'c' do tipo int
		byte d = (byte) c; // Atribui o valor da variável 'c' à variável 'd' do tipo byte, com conversão explícita (CAST) de int para byte
		System.out.println(d); // Imprime o valor da variável 'd' no console
		
		double e = 1.999999; // Atribui o valor 1.999999 à variável 'e' do tipo double
		int f = (int) e; // Atribui o valor da variável 'e' à variável 'f' do tipo int, com conversão explícita (CAST) de double para int
		System.out.println(f); // Imprime o valor da variável 'f' no console
		
	} // Fim do método main

} // Fim da classe ConversaoTipoPrimitivoNumerico


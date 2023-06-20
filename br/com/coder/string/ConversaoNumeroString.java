package fundamentos.br.com.coder.string; // Define o pacote ao qual a classe pertence

public class ConversaoNumeroString { // Declaração da classe pública ConversaoNumeroString
	
	public static void main(String[] args) { // Método principal main, ponto de entrada do programa
		
		Integer num1 = 10000; // Atribui o valor 10000 à variável 'num1' do tipo Integer (classe wrapper para int)
		System.out.println(num1.toString()); // Converte 'num1' para String usando o método toString() e imprime o resultado no console
		
		int num2 = 10000; // Atribui o valor 10000 à variável 'num2' do tipo int
		System.out.println(Integer.toString(num2).length()); // Converte 'num2' para String usando o método estático toString() da classe Integer e obtém o tamanho da String resultante usando o método length(), em seguida imprime o resultado no console
		
		System.out.println(" + num2".length()); // Imprime o tamanho da String " + num2" no console usando o método length()
		
	} // Fim do método main

} // Fim da classe ConversaoNumeroString

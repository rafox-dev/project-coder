package fundamentos.br.com.coder;

public class Wrappers {
	
	public static void main(String[] args) {
		
		Byte b = 100; // Declaração de uma variável do tipo Byte e atribuição de um valor literal
		Short s = 1000; // Declaração de uma variável do tipo Short e atribuição de um valor literal
		
		Integer i = 10000; // Declaração de uma variável do tipo Integer e atribuição de um valor literal
		Long l = 100000l; // Declaração de uma variável do tipo Long e atribuição de um valor literal com sufixo L
		
		System.out.println(b.byteValue()); // Impressão do valor armazenado na variável b após a chamada do método byteValue()
		System.out.println(s.toString()); // Impressão do valor armazenado na variável s após a chamada do método toString()
		System.out.println(i * 3); // Impressão do resultado da multiplicação do valor armazenado na variável i por 3
		System.out.println(l / 3); // Impressão do resultado da divisão do valor armazenado na variável l por 3
		
		Float f = 123.10F; // Declaração de uma variável do tipo Float e atribuição de um valor literal com sufixo F
		System.out.println(f); // Impressão do valor armazenado na variável f
		
		Boolean bo = Boolean.parseBoolean("true"); // Conversão de uma String para um valor do tipo Boolean usando o método parseBoolean()
		System.out.println(bo); // Impressão do valor armazenado na variável bo
		System.out.println(bo.toString().toUpperCase()); // Impressão do resultado da chamada do método toUpperCase() na String retornada pelo método toString() da variável bo
		
		Character c = '#'; // Declaração de uma variável do tipo Character e atribuição de um valor literal
		System.out.println(c.toString()); // Impressão do valor armazenado na variável c como uma String usando o método toString()
	}
}

package fundamentos; // Declaração do pacote fundamentos

public class PrimitivoVsObjeto { // Declaração da classe PrimitivoVsObjeto
	
	public static void main(String[] args) { // Declaração do método main
		
		String s = new String("texto"); // Criação de uma instância da classe String com o valor "texto" e atribuição à variável s
		s.toUpperCase(); // Chamada do método toUpperCase() na variável s, que retorna uma nova instância de String com todos os caracteres em maiúsculas. No entanto, a nova instância não é armazenada em lugar nenhum, então o código não tem nenhum efeito.
		
		// Wrappers podemos definir como uma versão de objetos para os tipos primitivos 
		int a = 123; // Declaração de uma variável do tipo int com o valor 123
		
	} // Fim do método main
	
} // Fim da classe PrimitivoVsObjeto

// Tudo em Java é baseado em classe e objeto, e fora isso os tipos primitivos. Este é um comentário que explica que a linguagem Java é orientada a objetos e que os tipos primitivos são uma exceção a essa regra. Os tipos primitivos são tipos de dados básicos que não são objetos, como int, double e boolean.

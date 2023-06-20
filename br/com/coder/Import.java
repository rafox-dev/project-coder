package fundamentos.br.com.coder;

import java.util.Date; // É uma classe da biblioteca padrão do Java que é utilizada para trabalhar com datas e horários.
import javax.swing.JButton; // É uma classe da biblioteca Swing do Java, que é usada para criar botões em interfaces gráficas de usuário (GUI).

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!"; // Declaração de uma variável do tipo String do pacote java.lang e atribuição de um valor literal
		java.lang.System.out.println(b); // Impressão do valor armazenado na variável b usando o método println() da classe System do pacote java.lang
		
		String s = "Bom dia!"; // Declaração de uma variável do tipo String e atribuição de um valor literal
		System.out.println(s); // Impressão do valor armazenado na variável s usando o método println() da classe System do pacote java.lang
		
		Date d = new Date(); // Declaração de uma variável do tipo Date e criação de uma nova instância da classe Date
		System.out.println(d); // Impressão do valor armazenado na variável d usando o método println() da classe System do pacote java.lang
		
		JButton botao = new JButton(); // Declaração de uma variável do tipo JButton da classe javax.swing e criação de uma nova instância da classe JButton
	}
}


// O comando import javax.swing.JButton é utilizado para importar a classe JButton no projeto Java. 
// Ao importar a classe JButton, podemos criar botões no programa e utilizar todos os métodos e funcionalidades disponíveis nessa classe.
// Ao importar a classe Date, podemos criar objetos Date e utilizar métodos para realizar diversas operações com datas e horários.
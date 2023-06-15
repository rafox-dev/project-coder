package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); // Imprime o caractere "á"
		
        String s = "Boa tarde";
        System.out.println(s.concat("!")); // Concatena o caractere "!" ao final da string e imprime "Boa tarde!"
        System.out.println(s + "!"); // Concatena o caractere "!" ao final da string e imprime "Boa tarde!"
        System.out.println(s.startsWith("Boa")); // Verifica se a string começa com "Boa" e imprime "true"
        System.out.println(s.toLowerCase().startsWith("Boa")); // Converte a string para minúsculas e verifica se começa com "Boa". Imprime "false"
        System.out.println(s.toLowerCase().startsWith("boa")); // Converte a string para minúsculas e verifica se começa com "boa". Imprime "true"
        System.out.println(s.length()); // Imprime o comprimento da string (10)
        System.out.println(s.endsWith("tarde!")); // Verifica se a string termina com "tarde!" e imprime "true"
        System.out.println(s.equals("boa tarde")); // Verifica se a string é igual a "boa tarde" e imprime "false"
        System.out.println(s.equalsIgnoreCase("Boa tarde")); // Verifica se a string é igual a "Boa tarde" (ignorando maiúsculas/minúsculas) e imprime "true"
		
		var nome = "Rafael";
		var sobrenome = "Bueno";
		var idade = 24;
		var salario = 1300.50;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario + "\n\n");
		
		// Uma maneira de identar melhor nossa linha de código acima, é usarmos o exemplo abaixo.
		System.out.printf("%s %s tem %d e ganha %.2f.", nome, sobrenome, idade, salario);
		
		// Outro exemplo usando a criação de uma variável com uso do .format que traz o mesmo resultado da linha de código acima.
		String frase = String.format("\n%s %s tem %d e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}

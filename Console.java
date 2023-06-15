package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom"); // Imprime a string "Bom" sem pular linha
		System.out.print("dia!\n\n"); // Imprime a string "dia!" e pula duas linhas
		
		System.out.println("Bom"); // Imprime a string "Bom" e pula linha
		System.out.println("dia!"); // Imprime a string "dia!" e pula linha
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6); // Imprime a string formatada com 6 números inteiros separados por espaço e um pulo de linha
		System.out.printf("Salário: %.1f%n", 1234.5678); // Imprime a string formatada com um número de ponto flutuante com uma casa decimal e um pulo de linha
		System.out.printf("Nome: %s%n", "João"); // Imprime a string formatada com o nome "João" e um pulo de linha
		
		Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário
		
		System.out.print("Digite seu nome: "); // Imprime a mensagem solicitando o nome do usuário
		String nome = entrada.nextLine(); // Lê o nome digitado pelo usuário
		
		System.out.print("Digite seu sobrenome: "); // Imprime a mensagem solicitando o sobrenome do usuário
		String sobrenome = entrada.nextLine(); // Lê o sobrenome digitado pelo usuário
		
		System.out.print("Digite sua idade: "); // Imprime a mensagem solicitando a idade do usuário
		int idade = entrada.nextInt(); // Lê a idade digitada pelo usuário
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade); // Imprime a mensagem com o nome, sobrenome e idade do usuário
		
		entrada.close(); // Fecha o objeto Scanner para liberar os recursos do sistema
	}

}


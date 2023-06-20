package fundamentos.br.com.coder;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 127; // Capaz de armazenar até o nº127
		short numeroDeVoos = 32767; // Capaz de armazenar do nº128 ao nº32767
		int id = 1234567890; // Capaz de aramazenar até 10 digitos
		long pontosAcumulados = 2134845222325L; // Capaz de armazenar 19 digitos 
		// Um número literal como esse usado no long, ao passar da capacidade de armazenamento de um int, usamos o L no final do número para dizer que é um literal do tipo long.
		
		// Tipos numéricos reais
		float salario = 1144550F; // Capaz de armazenar 6 digitos // Para ficar entendível, para definirmos um número como float podemos usar o F no final.
		double vendasAcumuladas = 2.9003467665; // Capaz de armazenar 15 digitos 
		
		// Tipo booleano
		boolean estaDeFerias = false; // Tipo boolean só retorna dois valores, true e false.
		
		// Tipo caractere
		char status = 'A'; // Só aceita uma única letra, o espaço também conta como caractere.
		// Dias de empresa desse funcionário 
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Id do usuário 
		System.out.println(id + " Ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println(status);
	}

}
// Podemos entender que, tudo que é menor, caberá em um tipo que seja maior, o que não acontece é o contrário.
// Até não usarmos uma variável, ela ficará com linha embaixo de destaque, até ser usada.
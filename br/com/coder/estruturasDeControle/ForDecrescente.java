package fundamentos.br.com.coder.estruturasDeControle;

public class ForDecrescente {
    public static void main(String[] args) {
        for (int contador = 10; contador >= 0; contador -= 2) { // Irá fazer a inicialização em 10, decrementar de 2 em 2 até o 0
            System.out.printf("Contador = %d\n", contador);
        }
    }
}

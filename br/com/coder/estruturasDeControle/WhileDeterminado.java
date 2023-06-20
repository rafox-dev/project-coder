package fundamentos.br.com.coder.estruturasDeControle;

public class WhileDeterminado {
    public static void main(String[] args) {

        int contador = 1;
        while(contador <= 10) {
            System.out.printf("i = %d\n", contador);
            contador++; // Encremento de 1 em 1 (Ou pode ser += 1)
            contador += 2; // Encremento de 2 em 2
        }
    }
}
// Esse é um exemplo de "while" determinado, pois definimos isso na variável contador
// O while é um estrutura usada para tratar uma quantidade indeterminada de vezes
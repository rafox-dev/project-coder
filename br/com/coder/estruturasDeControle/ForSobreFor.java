package fundamentos.br.com.coder.estruturasDeControle;

public class ForSobreFor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
//        for (int i = 0; i <10; i++ ) { // Variável pode ser declarada dentro do laço ou antes dele, porém com a regra abaixo.
//            System.out.println(i);
//        }
//        int i = 0;
//        System.out.println("Fora do scopo do laço for...");
//        System.out.println(i);
    }
}

// Se a variável for declarada dentro do laço "for", ela ficará restrita somente a esse laço.
// Caso ela seja declarada dentro do laço ou dentro do bloco, ela só poderá ser usada onde foi declarada.
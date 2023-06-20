package fundamentos.br.com.coder.estruturasDeControle;

public class For {
    public static void main(String[] args) {
        for(int contador = 0; contador <= 20; contador += 2){
             System.out.printf("i = %d\n", contador);
        }
        int x = 2;
        for(;x < 10;){
            System.out.println("abc = " + x);
            x++;
        }
    }
}

// O for possui três partes: for (a; b; c)

// (A) Inicialização
// (B) Condição
// (C) Tipo de incremento

package fundamentos.br.com.coder.estruturasDeControle;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for(int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }
        // Regra do desafio:

        // Trazer a "#" cinco vezes sem usar números dentro do laço
        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}

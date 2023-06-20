package fundamentos.br.com.coder.operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double media = 7.5;
        String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação"; // O uso do ? questiona o valor que a variável resultadoFinal irá recebe da variável média
        // Ao questionar o valor da variável resultadoFinal, se ela é maior ou igual ao valor da média ele recebe TRUE, caso não, FALSE.
        // O uso do : serve para separar os dois operandos que estarão sendo "questionados" na operação
        System.out.println("O aluno está " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean ganhaCertificado = bomComportamento && passouPorMedia;
        String resultado = ganhaCertificado ? "Sim" : "Não";

        System.out.println("Tem desconto? " + resultado);
    }
}
// O operador ternário é composto por 3 elementos, no caso acima foi, a variável e os dois operandos separados pelo :
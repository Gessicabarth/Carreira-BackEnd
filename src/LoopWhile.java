// Conteúdo abordado no curso

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);
        double mediaDasAvaliacoes = 0;
        double notaFilme = 0;
        int totalDeNotas = 0;


        while (notaFilme != -1) {
            System.out.println("Digite uma nota para a avaliação deste filme ou -1 para encerrar");
            notaFilme = leituraDeDados.nextDouble();

            if (notaFilme != -1) {
                mediaDasAvaliacoes += notaFilme;
                totalDeNotas++;

            }
        }

        System.out.println("Média de avaliações " + mediaDasAvaliacoes / totalDeNotas);


    }
}

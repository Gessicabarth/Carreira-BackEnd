import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);
        double mediaDasAvaliacoes = 0;
        double notaFilme = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota para a avaliação deste filme");
            notaFilme = leituraDeDados.nextDouble();
            mediaDasAvaliacoes += notaFilme;

        }


        System.out.println("Média de avaliações " + mediaDasAvaliacoes /3);

    }
}

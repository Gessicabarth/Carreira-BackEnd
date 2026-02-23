// Conteúdo abordado no curso

import java.util.Scanner;

public class LeituraDeDadosScanner {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFavorito = leituraDeDados.nextLine();

        System.out.println("Qual o ano de lançamento deste filme?");
        int anoDeLancamento = leituraDeDados.nextInt();

        System.out.println("Digite uma nota para a  avaliação deste filme");
        double avaliacaoFilme = leituraDeDados.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);
    }
}

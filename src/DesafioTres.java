import java.util.Random;
import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner entradaDeDadosDoUsuario = new Scanner(System.in);

        int chuteUsuario = -1;
        int numeroDeTentativas = 5;
        int contadorTentativas = 0;
        int numeroAleatorio = new Random().nextInt(5);
        String apresentacaoDoJogo = """
                Bem-vindo ao Jogo de Adivinhação!
                Regras gerais: Você terá 5 tentativas para acertar qual é o numero aleatório de 0 a 100.
                Boa Sorte!
                """;

        System.out.println(apresentacaoDoJogo);

        while (chuteUsuario != numeroAleatorio && contadorTentativas < numeroDeTentativas) {
            System.out.println("Digite um número de 0 a 100 ");
            chuteUsuario = entradaDeDadosDoUsuario.nextInt();

            if (chuteUsuario == numeroAleatorio) {
                System.out.println("Parabéns. Você Acertou!");
            } else {

                if (numeroAleatorio < chuteUsuario) {
                    System.out.println("O número aleatório é menor que " + chuteUsuario);
                } else {
                    System.out.println("O número aleatório é maior que " + chuteUsuario);
                }

                System.out.println("Restam " + (numeroDeTentativas - contadorTentativas - 1) + " tentativas.\n");
            }
            contadorTentativas++;
        }
    }
}

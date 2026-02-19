import java.util.Scanner;

public class ModuloQuatroDesafioExtra {
    public static void main(String[] args) {
        Scanner respostaUsuario = new Scanner(System.in);

        String nome = "Gessica Barth";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 10000;
        int opcaoEscolhida = 0;
        String dadosDaConta = "**************************************** \n" +
                "Dados iniciais do cliente: \n\n" +

                "Nome:              " + nome + "\n" +
                "Tipo da conta:     " + tipoDeConta + "\n" +
                "Saldo inicial:     R$ " + saldoDaConta + "\n" +
                "****************************************";
        String menuOperacoes = """
                
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada.
                """;

        System.out.println(dadosDaConta);

        while (opcaoEscolhida != 4) {
            System.out.println(menuOperacoes);
            opcaoEscolhida = respostaUsuario.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("O saldo atual é R$ " + saldoDaConta);

            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor a ser recebido ");
                double valorDigitado = respostaUsuario.nextDouble();
                saldoDaConta += valorDigitado;
                System.out.println("Valor recebido ");
                System.out.println("Saldo atual: " + saldoDaConta);

            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor a ser transferido ");
                double valorDigitado = respostaUsuario.nextDouble();
                if (valorDigitado > saldoDaConta) {
                    System.out.println("\nNão há saldo suficiente para fazer essa transferência. \n");
                } else {
                    System.out.println("\nSaldo suficiente para tranferência. \n");
                    saldoDaConta -= valorDigitado;
                    System.out.println("Saldo atual: " + saldoDaConta);
                }
            } else if (opcaoEscolhida != 4) {
                System.out.println("Opção inválida!");
            }


        }
    }

}


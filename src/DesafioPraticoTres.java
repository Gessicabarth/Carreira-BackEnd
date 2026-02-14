// Desafio Prático proposto no modulo 3 do curso "Java: criando a sua primeira aplicação",  com 6 atividades:

import java.util.Scanner;

public class DesafioPraticoTres {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

// Atividade prática 1.:

        int numeroUsuario;

        System.out.println("Digite um número: ");
        numeroUsuario = entradaDados.nextInt();

        if(numeroUsuario >= 0) {
            System.out.println("Você digitou um número positivo. \n");
        } else {
            System.out.println("Você digitou um número negativo. \n");
        }

//-------------------------------------------------------------------

// Atividade prática 2.:

        int primeiroNumeroInteiro;
        int segundoNumeroInteiro;

        System.out.println("Digite um número inteiro: ");
        primeiroNumeroInteiro = entradaDados.nextInt();
        System.out.println("Digite mais um número inteiro: ");
        segundoNumeroInteiro = entradaDados.nextInt();

        if (primeiroNumeroInteiro == segundoNumeroInteiro) {
            System.out.println("Os dois números digitados são iguais. \n");
        } else if (primeiroNumeroInteiro < segundoNumeroInteiro) {
            System.out.println("Os dois números digitados são diferentes. O número " + primeiroNumeroInteiro + " é menor que o númeor " + segundoNumeroInteiro + ". \n");
        } else {
            System.out.println("Os dois números digitados são diferentes. O número " + primeiroNumeroInteiro + " é maior que o númeor " + segundoNumeroInteiro + ". \n");
        }

//-------------------------------------------------------------------

// Atividade prática 3.:

        double r = 70;
        double areaDoCirculo = 3.14 * r * r;
        double l = 40;
        double areaDoQuadrado = l * l;
        int escolhaUsuario;
        String menu = """
                            MENU
                1. Calcular área do quadrado.
                2. Calcular área do círculo.

                Digite 1 para calcular a área do quadrado e 2 para calcular a área do círculo.
                \n""";


        System.out.println(menu + "Escolha a opção desejada: ");
        escolhaUsuario = entradaDados.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("A a área do quadrado é: " + areaDoQuadrado + "m² \n");
        } else {
            System.out.println("A a área do circulo é: " + areaDoCirculo + "cm² \n");
        }


//-------------------------------------------------------------------

// Atividade prática 4.:

        int numeroEscolhido;

        System.out.println("Digite o número de 1 a 10 de qual tabuada deseja saber: ");
        numeroEscolhido = entradaDados.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroEscolhido * i);
        }


//-------------------------------------------------------------------

// Atividade prática 5.:

        int numeroInteiro;

        System.out.println("Digite um número inteiro: ");
        numeroInteiro = entradaDados.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("O número é par. \n");
        } else {
            System.out.println("O número é ímpar. \n");
        }



//-------------------------------------------------------------------

// Atividade prática 6.:

        int numero;
        int resultado = 1;

        System.out.println("Digite um número inteiro: ");
        numero = entradaDados.nextInt();

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;

        }
        System.out.println(resultado);

    }
}

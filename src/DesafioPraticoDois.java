public class DesafioPraticoDois {
    public static void main (String[] args) {

        // Exercício 1.:
        double notaGabriel = (9.8 + 9.0) / 2;

        System.out.println("A media da nota é: " + notaGabriel);

//-------------------------------------------------------------------

        // Exercício 2.:
        double variavelDouble = 3.33;
        int castingVariavelDouble = (int) variavelDouble;

        System.out.println(castingVariavelDouble);

//-------------------------------------------------------------------

        // Exercício 3.:
        char variavelChar = 'G';
        String variavelString = "essica";

        System.out.println("Me chamo " + variavelChar + variavelString);

//-------------------------------------------------------------------

        // Exercício 4.:
        double precoProduto = 14.99;
        int quantidade = 7;

        System.out.println("Valor total = " + precoProduto * quantidade);

// Outra forma de fazer, exemplo professor:
//        double precoProduto = 29.99;
//        int quantidade = 3;
//
//        double total = precoProduto * quantidade;
//
//        String mensagem = "O valor total da compra é R$" + total;
//
//        System.out.println(mensagem);
//


//-------------------------------------------------------------------

        // Exercício 5.:
        double valorEmDolares = 104.0;
        double conversaoDoDolar = valorEmDolares * 4.94;

        System.out.println("Valor do dólar em reais = R$" + conversaoDoDolar);

//  Outra forma de fazer, exemplo professor:
//        double valorEmDolares = 100.50;
//        double taxaDeConversao = 4.94;
//
//        double valorEmReais = valorEmDolares * taxaDeConversao;
//
//        System.out.println("O valor em reais é: " + valorEmReais);


//-------------------------------------------------------------------

        // Exercício 6.:
        double precoOriginal = 75.95;
        double percentualDesconto = 5;
        double valorTotalComDesconto = precoOriginal - (percentualDesconto / 100 * precoOriginal);

        System.out.println("Valor total com o desconto = " + valorTotalComDesconto);


// Outra forma de fazer:
//
//        double precoOriginal = 75.95;
//        double percentualDesconto = 5;
//        precoOriginal = precoOriginal - (percentualDesconto / 100 * precoOriginal);
//
//        System.out.println("Preço original com o desconto = " + precoOriginal);

//

//  Outra forma de fazer, exemplo professor:
//        double precoOriginal = 150.0;
//
//        double percentualDesconto = 10.0;
//        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
//        double novoPreco = precoOriginal - valorDesconto;
//
//        System.out.println("Preço original: R$" + precoOriginal);
//        System.out.println("Desconto: R$" + valorDesconto);
//        System.out.println("Novo preço com desconto: R$" + novoPreco);
//
    }
}

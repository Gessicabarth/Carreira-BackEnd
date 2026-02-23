// Desafio prático proposto no modulo 2 do curso "Java: criando a sua primeira aplicação". Escrever um programa que converta uma temperatura em graus Celsius para Fahrenheit.

public class DesafioDois {

    public static void main (String[] args) {

        double temperaturaC = 22;

        System.out.println((temperaturaC * 1.8) + 32);

        int temperaturaF = (int) (temperaturaC * 1.8) + 32;
        System.out.println(temperaturaF);



//  Forma de resolução 1 - Gabriel:
//        double temperaturaC = 22;
//        double temperaturaF = (temperaturaC * 1.8) + 32;
//        System.out.println(temperaturaF);
//        int temperaturaFInteira = (int) temperaturaF;
//        System.out.println(temperaturaFInteira);

//  Forma de resolução 2 - Gabriel:
//        double temperaturaC = 22;
//        double temperaturaF = (temperaturaC * 1.8) + 32;
//        System.out.println(temperaturaF);
//        System.out.println((int) temperaturaF);

//  Forma de resolução 3 - Alura:
//        double temperaturaEmCelsius = 30.4;
//        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
//        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);
//        System.out.println(mensagem);
//        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
//        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
//
    }
}

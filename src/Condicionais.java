public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluindoNoPlano = true;
        double notaDoFilme = 6.4;
        String tipoDoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("O lançamento mais queridinho do momento!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluindoNoPlano == true || tipoDoPlano.equals("plus")) {
            System.out.println("Filme liberado para o seu plano");
        } else {
            System.out.println("Este filme não esta incluso no seu plano atual. Alugue-o para assistir.");
        }

    }
}

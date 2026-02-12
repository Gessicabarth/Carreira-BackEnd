public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Operação Natal");

        int anoDeLancamento = 2024;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 6.4;
        System.out.println("Nota do filme: " + notaDoFilme);

        // Média calculada pelas 3 notas, Gessica, Gabriel e sites
        double media = (8.4 + 9.0 + 6.4) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Operação de Natal
                Filme de natalino de ação com o ator The Rock
                Ótimo filme de natal com mistura de ação e aventura!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}
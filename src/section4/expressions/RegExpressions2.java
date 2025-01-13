package section4.expressions;

public class RegExpressions2 {
    public static void main(String[] args) {
        // Teste da primeira expressão regular
        System.out.println("First regular expression: ");
        // Verifica se a string "Lat" segue o padrão: qualquer letra ou número seguido por "at"
        System.out.println("Lat".matches("\\wat"));

        // Teste da segunda expressão regular
        System.out.println("Second regular expression: ");
        // Verifica se a string tem o formato "DDD-DDD-DDDD", onde D é um dígito
        System.out.println("321-333-7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));

        // Teste da terceira expressão regular
        System.out.println("Third regular expression: ");
        // Mesmo formato que a segunda, mas com "." como separador
        System.out.println("321.333.7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));

        // Teste da quarta expressão regular
        System.out.println("Fourth regular expression: ");
        // Mesmo formato que a segunda, mas com espaço como separador
        System.out.println("321 333 7652".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));

        // Teste da quinta expressão regular
        System.out.println("Fifth regular expression: ");
        // Permite múltiplos separadores ([-.\s]+ indica um ou mais separadores)
        System.out.println("321  333  7652".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}"));

        // Teste da sexta expressão regular
        System.out.println("Sixth regular expression: ");
        // Permite que os separadores sejam opcionais ([-.\s]* indica zero ou mais separadores)
        System.out.println("3213337652".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{4}"));

        // Teste da sétima expressão regular
        System.out.println("Seventh regular expression: ");
        // Permite no máximo um separador entre os grupos ([-.\s]? indica zero ou um separador)
        System.out.println("321-333-7652".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}"));

        // Teste da oitava expressão regular
        System.out.println("Eighth regular expression: ");
        // Permite 3 ou 4 dígitos no último grupo (\d{3,4})
        System.out.println("321-333-765".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,4}"));

        // Teste da nona expressão regular
        System.out.println("Ninth regular expression: ");
        // Permite 3 ou mais dígitos no último grupo (\d{3,})
        System.out.println("321-333-76589".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,}"));

        // Teste da décima expressão regular
        System.out.println("Tenth regular expression: ");
        // Verifica dois grupos de 3 dígitos seguidos de separadores, seguidos por 3 ou mais dígitos
        System.out.println("321-333-76589".matches("(\\d{3}[-.\\s]?){2}\\d{3,}"));

        // Teste da décima primeira expressão regular
        System.out.println("Eleventh regular expression: ");
        // Permite 1 ou 2 grupos de 3 dígitos seguidos de separadores, seguidos por 3 ou mais dígitos
        System.out.println("321-333-76589".matches("(\\d{3}[-.\\s]?){1,2}\\d{3,}"));

        // Teste da décima segunda expressão regular
        System.out.println("Twelfth regular expression: ");
        // Permite um prefixo opcional "1" seguido de 1 ou 2 grupos de 3 dígitos com separadores e 3 ou mais dígitos no final
        System.out.println("321-333-76589".matches("(1[-.\\s]?)?(\\d{3}[-.\\s]?){1,2}\\d{3,}"));
    }
}
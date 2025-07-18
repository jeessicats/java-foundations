package section4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroups {
    public static void main(String[] args) {
        // Expressão regular para dividir partes de um número de telefone
        // A string utiliza a sintaxe multilinha para maior clareza
        String phoneNumberRegex = """
# This is my regex to parse the parts of a phone number
(?:(?<countryCode>\\d{1,2})[-.\\s]?)? # (Opcional) Captura o código do país (1 ou 2 dígitos) seguido de separador
(?:\\(?(?<areaCode>\\d{3})\\)?[-.\\s]?) # Captura o código de área (3 dígitos) seguido de separador
(?:(?<exchange>\\d{3})[-.\\s]?) # Captura a troca (3 dígitos) seguido de separador
(?<lineNumber>\\d{3,4}) # Captura o número da linha (3 ou 4 dígitos)
""";
        // Número de telefone de exemplo a ser analisado
        String phoneNumber = "12 (321) 333-7658";

        // Criação de um padrão (Pattern) a partir da expressão regular
        // A flag Pattern.COMMENTS permite comentários na expressão regular
        // Aviso: Pattern.compile tem um custo computacional, evite usá-lo repetidamente
        // em loops ou chamadas frequentes
        // A expressão regular é compilada em um padrão que pode ser usado para criar um matcher

        Pattern phoneNumPattern = Pattern.compile(phoneNumberRegex, Pattern.COMMENTS);

        // Matcher é usado para verificar se a string corresponde ao padrão e extrair grupos de captura
        Matcher phoneNumMatcher = phoneNumPattern.matcher(phoneNumber);

        // Verifica se a string corresponde à expressão regular
        if (phoneNumMatcher.matches()) {

            System.out.println(phoneNumber);
            // Extrai e imprime o grupo nomeado "countryCode" (código do país)
            System.out.format("Country code: %s\n", phoneNumMatcher.group("countryCode"));

            // Extrai e imprime o grupo nomeado "areaCode" (código de área)
            System.out.format("Area code: %s\n", phoneNumMatcher.group("areaCode"));

            // Extrai e imprime o grupo nomeado "exchange" (troca)
            System.out.format("Exchange: %s\n", phoneNumMatcher.group("exchange"));

            // Extrai e imprime o grupo nomeado "lineNumber" (número da linha)
            System.out.format("Line number: %s\n", phoneNumMatcher.group("lineNumber"));
        }
    }
}

package section5;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalculation {

    // Formatação para valores monetários em dólares americanos
    private static final DecimalFormat moneyFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US); // Corrigido para Locale.US

    // Formatação para porcentagens
    private static final NumberFormat percentFormat = NumberFormat.getPercentInstance();

    public static BigDecimal getCompoundInterest(String principal, String rate, int period, String contribution) throws ParseException {
        // Adicionar o símbolo de porcentagem para a taxa
        String rateWithPercentage = rate + "%";
        // Converter a taxa para decimal (ex.: 8% -> 0.08)
        Number parsedRate = percentFormat.parse(rateWithPercentage);
        BigDecimal rateAsPercentage = new BigDecimal(parsedRate.toString());

        // Converter valores monetários para BigDecimal
        BigDecimal principalAmount = new BigDecimal(moneyFormat.parse(principal).toString());
        BigDecimal contributionAmount = new BigDecimal(moneyFormat.parse(contribution).toString());

        // Calcular o montante total após o período de capitalização
        // Fórmula: A = C * (((1 + r)^Y - 1) / r) + P * (1 + r)^Y
        // Onde:
        // A é o montante total após o período de capitalização
        // C é o valor da contribuição periódica
        // r é a taxa de juros (em decimal)
        // Y é o número de períodos de capitalização
        // P é o valor principal (capital inicial)

        BigDecimal onePlusRPowY = BigDecimal.ONE.add(rateAsPercentage).pow(period); // (1 + r)^Y
        BigDecimal onePlusRTimesYMinusOne = onePlusRPowY.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal onePlusRTimesYMinusOneDivR = onePlusRTimesYMinusOne.divide(rateAsPercentage); // ((1 + r)^Y - 1) / r
        BigDecimal onePlusRTimesYMinusOneDivRTimesC = onePlusRTimesYMinusOneDivR.multiply(contributionAmount); // C * (((1 + r)^Y - 1) / r)
        BigDecimal onePlusRPowYTimesP = onePlusRPowY.multiply(principalAmount);
        BigDecimal result = onePlusRTimesYMinusOneDivRTimesC.add(onePlusRPowYTimesP);
        return result;
    }

    // Método principal para testar o cálculo de juros compostos
    public static void main(String[] args) throws ParseException {

        // Exemplo de uso do método getCompoundInterest
        DecimalFormat decimalFormat = new DecimalFormat("R$#,###.00;R$(#,###.##)"); // Formatação para valores monetários em reais

        // Formatação para porcentagens
        DecimalFormat percentForma = new DecimalFormat("%#");

        // Exemplo de cálculo de juros compostos
        BigDecimal balance = CompoundInterestCalculation.getCompoundInterest("$10,000", "8", 10, "$1,000");

        // Exibir o resultado formatado
        System.out.println(moneyFormat.format(balance));

        System.out.println(decimalFormat.format(balance));

        System.out.println(percentFormat.format(.8));

        System.out.printf("R$%,.2f%n", balance);
    }
}

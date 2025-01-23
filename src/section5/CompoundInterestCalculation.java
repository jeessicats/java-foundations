package section5;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalculation {

    private static final DecimalFormat moneyFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US); // Corrigido para Locale.US
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

        BigDecimal onePlusRPowY = BigDecimal.ONE.add(rateAsPercentage).pow(period); // (1 + r)^Y
        BigDecimal onePlusRTimesYMinusOne = onePlusRPowY.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)
        BigDecimal onePlusRTimesYMinusOneDivR = onePlusRTimesYMinusOne.divide(rateAsPercentage); // ((1 + r)^Y - 1) / r
        BigDecimal onePlusRTimesYMinusOneDivRTimesC = onePlusRTimesYMinusOneDivR.multiply(contributionAmount); // C * (((1 + r)^Y - 1) / r)
        BigDecimal onePlusRPowYTimesP = onePlusRPowY.multiply(principalAmount);
        BigDecimal result = onePlusRTimesYMinusOneDivRTimesC.add(onePlusRPowYTimesP);
        return result;
    }

    public static void main(String[] args) throws ParseException {
        BigDecimal balance = CompoundInterestCalculation.getCompoundInterest("$10,000", "8", 10, "$1,000");
        System.out.println(moneyFormat.format(balance));
    }
}

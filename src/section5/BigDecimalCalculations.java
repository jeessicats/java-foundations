package section5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalCalculations {  // Declaração da classe BigDecimalCalculations
    public static void main(String[] args) {  // Método principal onde o programa começa a execução

        // Declaração de dois números float
        float num1 = 2.15f;
        float num2 = 1.10f;

        // Operação de subtração com float (impreciso devido ao armazenamento em binário)
        System.out.println(num1 - num2);  // Saída: 1.0499999523162842 (não exato)

        // Declaração de dois números BigDecimal inicializados corretamente com Strings
        // the BigDecimal constructor should not be used with float or double
        // to avoid precision issues
        // Use String to ensure exact representation
        // BigDecimal é usado para cálculos financeiros e outras operações que requerem precisão
        // BigDecimal has a big computational cost, so it should be used only when necessary

        BigDecimal num3 = new BigDecimal("2.15");
        BigDecimal num4 = new BigDecimal("1.10");

        System.out.println("2.15 * 1.10 = " + new BigDecimal("2.15").multiply(new BigDecimal("1.10")));  // Saída: 1.05 (preciso)

        // Subtração exata usando BigDecimal
        // BigDecimal has methods for precise arithmetic operations
        System.out.println(num3.subtract(num4));  // Saída: 1.05 (preciso)

        // Declaração de dois BigDecimals para demonstração de operações matemáticas
        BigDecimal num5 = new BigDecimal("3.14159265");
        BigDecimal num6 = new BigDecimal("2.99792458");

        // Definição de um MathContext para controlar precisão e arredondamento
        // MathContext é usado para definir a precisão e o modo de arredondamento
        // MathContext é útil para operações que requerem precisão específica, como divisão e raiz quadrada
        // RoundingMode.HALF_UP é o modo de arredondamento mais comum, arredonda para o inteiro mais próximo
        MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);

        // Operações matemáticas usando BigDecimal
        System.out.println("Adição: " + num5.add(num6));  // Adição: 6.13951723
        System.out.println(num5.multiply(num6));  // Multiplicação: 9.4120139995547977
        System.out.println(num5.subtract(num6));  // Subtração: 0.14366807

        // Divisão com precisão e arredondamento usando MathContext para controlar a precisão e não ocorrer problemas de precisão ou numeros infinitos
        System.out.println(num5.divide(num6, mathContext));  // Divisão com precisão e arredondamento: 1.0478

        System.out.println(num5.sqrt(mathContext));  // Raiz quadrada com precisão: 1.7725

        // Resto da divisão com precisão e arredondamento
        // O método remainder retorna o resto da divisão de dois BigDecimals
        // É útil quando você precisa do resultado da divisão inteira e do resto
        // can be used to find out if a number is even or odd, for example like with the % operator in Java
        System.out.println(num5.remainder(num6, mathContext));  // Resto da divisão: 0.1437


        // Inicialização a ser evitada: usando valores primitivos diretamente
        BigDecimal num7 = new BigDecimal(3.14159265);  // Imprecisão devido ao uso de float/double
        short myShort = 6858;
        BigDecimal num8 = new BigDecimal(myShort);  // Inicialização com short (permitida, mas raramente necessária)

        // Convertendo BigDecimal de volta para um short
        short s = num8.shortValue();
        System.out.println(s);  // Saída: 6858

        // Convertendo BigDecimal para String usando toString()
        String myString = num7.toString();
        System.out.println(myString);  // Saída: 3.1415926500000000828505012278652191162109375
    }
}

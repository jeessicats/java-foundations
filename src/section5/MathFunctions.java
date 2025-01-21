package section5;

public class MathFunctions {  // Declaração da classe MathFunctions
    public static void main(String[] args) {  // Método principal onde o programa começa a execução

        // Exibe o valor absoluto de -27, ou seja, transforma o número negativo em positivo
        System.out.println(Math.abs(-27));  // Saída: 27

        // Arredonda para cima o número 5.0 (mantém igual, pois já é inteiro)
        System.out.println(Math.ceil(5.0));  // Saída: 5.0

        // Arredonda para cima o número 5.4 (próximo número inteiro maior)
        System.out.println(Math.ceil(5.4));  // Saída: 6.0

        // Arredonda para cima o número 5.001 (próximo número inteiro maior)
        System.out.println(Math.ceil(5.001));  // Saída: 6.0

        // Arredonda para baixo o número 5.001 (próximo número inteiro menor)
        System.out.println(Math.floor(5.001));  // Saída: 5.0

        // Arredonda para baixo o número 5.999 (próximo número inteiro menor)
        System.out.println(Math.floor(5.999));  // Saída: 5.0

        // Declara duas variáveis inteiras
        int num1 = 7;
        int num2 = 17;

        // Exibe o menor valor entre num1 e num2
        System.out.println(Math.min(num1, num2));  // Saída: 7

        // Exibe o maior valor entre num1 e num2
        System.out.println(Math.max(num1, num2));  // Saída: 17

        // Calcula a potência de 2 elevado a 2 (2^2)
        System.out.println(Math.pow(2, 2));  // Saída: 4.0

        // Aqui há um erro! Math.clamp não é uma função padrão em Java. Isso pode gerar erro de compilação.
        // Se deseja implementar funcionalidade semelhante, pode criar um método que limite um valor entre dois outros.

        // Gera um número aleatório entre 1 e 10 (número aleatório de 0 a 9 + 1)
        System.out.println((int)(Math.random() * 10) + 1);

        // Gera um número aleatório entre 0 e 100, arredondado para o número inteiro mais próximo
        System.out.println(Math.round(Math.random() * 100));

        // Calcula a raiz quadrada de 81
        System.out.println(Math.sqrt(81));  // Saída: 9.0

        // Exibe o valor da constante PI (3.14159...)
        System.out.println(Math.PI);

        // Exibe o valor da constante E (2.71828...)
        System.out.println(Math.E);
    }
}
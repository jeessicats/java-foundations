package section5;

public class ComparingNumbers {  // Declaração da classe ComparingNumbers
    public static void main(String[] args) {  // Método principal onde o programa começa a execução

        // Declaração e inicialização de três variáveis inteiras
        // = atribuição de valor às variáveis
        // == operador de comparação para verificar igualdade entre valores
        int a = 10;  // Valor da variável 'a' é 10
        int b = 10;  // Valor da variável 'b' é 10
        int c = 20;  // Valor da variável 'c' é 20

        // Compara se 'a' é igual a 'b' e imprime o resultado como um boolean
        System.out.println(a == b);  // Saída: true (10 é igual a 10)

        // Compara se 'a' é maior que 'c' e imprime o resultado as um boolean
        System.out.println(a > c);  // Saída: false (10 não é maior que 20)

        // Compara se 'a' é menor que 'c' e imprime o resultado as um boolean
        System.out.println(a < c);  // Saída: true (10 é menor que 20)

        // Compara se 'a' é maior ou igual a 'b' e imprime o resultado as um boolean
        System.out.println(a >= b);  // Saída: true (10 é igual a 10)

        // Compara se 'a' é menor ou igual a 'c' e imprime o resultado as um boolean
        System.out.println(a <= c);  // Saída: true (10 é menor que 20)

        // Compara se 'a' é diferente de 'b' e imprime o resultado as um boolean
        System.out.println(a != b);  // Saída: false (10 não é diferente de 10)
    }
}


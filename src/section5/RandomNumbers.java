package section5;

import java.security.SecureRandom; // Importa a classe SecureRandom, usada para gerar números aleatórios mais seguros
import java.util.Random; // Importa a classe Random, usada para gerar números pseudoaleatórios

public class RandomNumbers {  // Declaração da classe RandomNumbers
    public static void main(String[] args) {  // Método principal onde o programa começa a execução

        // Cria uma instância da classe Random com uma semente (seed) fixa: 394573945
        // A semente faz com que a sequência de números gerados seja sempre a mesma.
        Random random = new Random(394573945);

        // Gera e exibe cinco números inteiros aleatórios no intervalo de 0 a 9 (exclusive).
        System.out.println(random.nextInt(10));  // Exemplo de saída: 8
        System.out.println(random.nextInt(10));  // Exemplo de saída: 7
        System.out.println(random.nextInt(10));  // Exemplo de saída: 1
        System.out.println(random.nextInt(10));  // Exemplo de saída: 5
        System.out.println(random.nextInt(10));  // Exemplo de saída: 4

        // Cria uma instância da classe SecureRandom, usada para gerar números aleatórios mais imprevisíveis
        SecureRandom secureRandom = new SecureRandom();

        // Gera e exibe cinco números inteiros aleatórios no intervalo de 0 a 9 (exclusive) usando SecureRandom.
        System.out.println(secureRandom.nextInt(10));  // Saída: (imprevisível)
        System.out.println(secureRandom.nextInt(10));  // Saída: (imprevisível)
        System.out.println(secureRandom.nextInt(10));  // Saída: (imprevisível)
        System.out.println(secureRandom.nextInt(10));  // Saída: (imprevisível)
        System.out.println(secureRandom.nextInt(10));  // Saída: (imprevisível)
    }
}


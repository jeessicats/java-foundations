package section5;

public class CentripetalForce {  // Início da classe CentripetalForce

    public static void main(String[] args) {  // Método principal onde o programa começa a execução
        // Calcula a velocidade ao longo da trajetória e armazena o resultado na variável pathVelocity
        // A velocidade é calculada usando o raio da trajetória (0.8) e o período (3.0)
        double pathVelocity = calculatePathVelocity(0.8, 3.0);
        // Imprime o valor da velocidade ao longo da trajetória
        System.out.println(pathVelocity);  // Imprime o valor da velocidade ao longo da trajetória

        // Calcula a aceleração centrípeta usando a velocidade ao longo da trajetória e o raio, e armazena o resultado
        // A aceleração centrípeta é calculada usando a velocidade ao longo da trajetória (pathVelocity) e o raio (0.8)
        double centripetalAcceleration = calculateCentripetalAcceleration(pathVelocity, 0.8);
        // Imprime o valor da aceleração centrípeta
        System.out.println(centripetalAcceleration);  // Imprime o valor da aceleração centrípeta

        // Calcula a força centrípeta, usando a massa e a aceleração centrípeta, e armazena o resultado
        // A força centrípeta é calculada usando a massa (0.2) e a aceleração centrípeta (centripetalAcceleration)
        double centripetalForce = calculateCentripetalForce(0.2, centripetalAcceleration);
        // Imprime o valor da força centrípeta
        System.out.println(centripetalForce);  // Imprime o valor da força centrípeta
    }

    // Método para calcular a velocidade ao longo da trajetória (V = C / T), onde C é a circunferência e T é o período
    public static double calculatePathVelocity(double radius, double period) {
        // Calcula a circunferência da trajetória (C = 2πr), onde r é o raio
        // Fórmula: C = 2 * π * r
        // Onde Math.PI é uma constante que representa o valor de π (pi)
        // O raio é fornecido como parâmetro, e o período também é fornecido como parâmetro
        double circumference = 2 * Math.PI * radius;
        // Retorna a velocidade ao longo da trajetória (V = C / T)
        return circumference / period;
    }

    // Método para calcular a aceleração centrípeta (a = V² / r), onde V é a velocidade ao longo da trajetória e r é o raio
    public static double calculateCentripetalAcceleration(double pathVelocity, double radius) {
        // Retorna a aceleração centrípeta calculada pela fórmula a = V² / r
        // Onde V é a velocidade ao longo da trajetória e r é o raio
        // A aceleração centrípeta é a aceleração necessária para manter um objeto em movimento circular
        // A fórmula é derivada da segunda lei de Newton, onde a força centrípeta é igual à massa vezes a aceleração centrípeta
        // A aceleração centrípeta é proporcional ao quadrado da velocidade e inversamente proporcional ao raio
        // A fórmula é: a = V² / r
        return Math.pow(pathVelocity, 2) / radius;
    }

    // Método para calcular a força centrípeta (F = m * a), onde m é a massa e a é a aceleração centrípeta
    public static double calculateCentripetalForce(double mass, double centripetalAcceleration) {
        // Retorna a força centrípeta calculada pela fórmula F = m * a
        // Onde m é a massa do objeto e a é a aceleração centrípeta
        // A força centrípeta é a força necessária para manter um objeto em movimento circular
        // A fórmula é derivada da segunda lei de Newton, onde a força é igual à massa vezes a aceleração
        // A força centrípeta é proporcional à massa do objeto e à aceleração centrípeta
        // A fórmula é: F = m * a
        return mass * centripetalAcceleration;
    }

    public static double calculateCentripetalForce(double mass, double radius, double period) {
        // Calcula a velocidade ao longo da trajetória
        double pathVelocity = calculatePathVelocity(radius, period);
        // Calcula a aceleração centrípeta
        double centripetalAcceleration = calculateCentripetalAcceleration(pathVelocity, radius);
        // Retorna a força centrípeta
        return calculateCentripetalForce(mass, centripetalAcceleration);
    }
}

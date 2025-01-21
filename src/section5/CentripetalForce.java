package section5;

public class CentripetalForce {  // Início da classe CentripetalForce

    public static void main(String[] args) {  // Método principal onde o programa começa a execução
        // Calcula a velocidade ao longo da trajetória e armazena o resultado na variável pathVelocity
        double pathVelocity = calculatePathVelocity(0.8, 3.0);
        System.out.println(pathVelocity);  // Imprime o valor da velocidade ao longo da trajetória

        // Calcula a aceleração centrípeta usando a velocidade ao longo da trajetória e o raio, e armazena o resultado
        double centripetalAcceleration = calculateCentripetalAcceleration(pathVelocity, 0.8);
        System.out.println(centripetalAcceleration);  // Imprime o valor da aceleração centrípeta

        // Calcula a força centrípeta, usando a massa e a aceleração centrípeta, e armazena o resultado
        double centripetalForce = calculateCentripetalForce(0.2, centripetalAcceleration);
        System.out.println(centripetalForce);  // Imprime o valor da força centrípeta
    }

    // Método para calcular a velocidade ao longo da trajetória (V = C / T), onde C é a circunferência e T é o período
    public static double calculatePathVelocity(double radius, double period) {
        // Calcula a circunferência da trajetória (C = 2πr), onde r é o raio
        double circumference = 2 * Math.PI * radius;
        // Retorna a velocidade ao longo da trajetória (V = C / T)
        return circumference / period;
    }

    // Método para calcular a aceleração centrípeta (a = V² / r), onde V é a velocidade ao longo da trajetória e r é o raio
    public static double calculateCentripetalAcceleration(double pathVelocity, double radius) {
        // Retorna a aceleração centrípeta calculada pela fórmula a = V² / r
        return Math.pow(pathVelocity, 2) / radius;
    }

    // Método para calcular a força centrípeta (F = m * a), onde m é a massa e a é a aceleração centrípeta
    public static double calculateCentripetalForce(double mass, double centripetalAcceleration) {
        // Retorna a força centrípeta calculada pela fórmula F = m * a
        return mass * centripetalAcceleration;
    }
}

package section5;

public class CentripetalForce {
    public static void main(String[] args) {
        double pathVelocity = calculatePathVelocity(0.8, 3.0);
        System.out.println(pathVelocity);
        double centripetalAcceleration = calculateCentripetalAcceleration(pathVelocity, 0.8);
        System.out.println(centripetalAcceleration);
        double centripetalForce = calculateCentripetalForce(0.2, centripetalAcceleration);
        System.out.println(centripetalForce);
    }

    public static double calculatePathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;
        return circumference/period;
    }

    public static double calculateCentripetalAcceleration(double pathVelocity, double radius) {
        return Math.pow(pathVelocity, 2) / radius;
    }

    public static double calculateCentripetalForce(double mass, double centripetalAcceleration) {
        return mass * centripetalAcceleration;
    }
}

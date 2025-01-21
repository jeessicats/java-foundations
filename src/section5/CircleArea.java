package section5;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println(circleArea(5.7));
        System.out.println(circleArea(3));
    }

    /**
     * This method calculates the area of a circle
     * It uses the formula: area = PI * radius^2
     * @param radius
     * @return
     */
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

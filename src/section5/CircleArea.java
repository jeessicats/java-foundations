package section5;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println(circleArea(5.7));
        System.out.println(circleArea(3));
    }

    // To create a javadoc, you can use the following command in the terminal:
    // put the mouse above the method, press /** and then press enter.
    // Alternatively, you can run the command `javadoc -d doc CircleArea.java` in the terminal.
    // This will generate the documentation in the 'doc' directory.
    // You can then view the documentation by opening the index.html file in the 'doc' directory.


    /**
     * Calculates the area of a circle given its radius.
     * The formula used is area = π * radius^2, where π (Pi) is a mathematical constant approximately equal to 3.14159.
     * This method takes the radius as a parameter and returns the calculated area as a double.
     * @param radius
     * @return
     */
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2); // calculates the area of a circle using the formula area = PI * radius^2
    }
}

package section5;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println(Math.abs(-27));
        System.out.println(Math.ceil(5.0));
        System.out.println(Math.ceil(5.4));
        System.out.println(Math.ceil(5.001));
        System.out.println(Math.floor(5.001));
        System.out.println(Math.floor(5.999));

        int num1 = 7;
        int num2 = 17;
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));

        System.out.println(Math.pow(2, 2));

        Math.clamp(2.45, 2, 9);

        System.out.println((int)(Math.random() * 10) + 1);

        System.out.println(Math.round(Math.random() * 100));

        System.out.println(Math.sqrt(81));

        System.out.println(Math.PI);

        System.out.println(Math.E);
    }
}

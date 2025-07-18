package section4.regex;

public class RegExpressions1 {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));
        System.out.println("cat".matches("cat|dog"));
        System.out.println("cat".matches("Cat"));
        System.out.println("cat".matches("[Cc]at"));

        System.out.println("Bat".matches("[a-fA-F]at"));
        System.out.println("bat".matches("[^b]at"));
    }
}

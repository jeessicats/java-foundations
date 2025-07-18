package section4.regex;

public class RegExpression3 {
    public static void main(String[] args) {
        System.out.println("kitty".matches(".....")); //Matches any character

        System.out.println("kitty".matches(".*"));

        System.out.println("kitty".matches(".+"));

        System.out.println("kitty".matches(".?")); //Would not match

        System.out.println("kitty".matches("^.....")); // ^ Matches the beginning of a String
        System.out.println("kitty".matches("^.....$")); // $ Matches the final of the String
    }
}

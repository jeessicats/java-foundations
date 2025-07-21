package section4.regex;

public class RegExpression3 {
    public static void main(String[] args) {
        System.out.println("kitty".matches(".....")); //Matches any character exactly 5 times

        System.out.println("kitty".matches(".*")); //Matches any character 0 or more times

        System.out.println("kitty".matches(".+")); //Matches any character 1 or more times

        System.out.println("kitty".matches(".?")); //Matches any character 0 or 1 times

        System.out.println("kitty".matches("^.....")); // ^ Matches the beginning of a String and then matches any character exactly 5 times
        System.out.println("kitty".matches("^.....$")); // $ Matches the final of the String
        System.out.println("kitty".matches("\\b.....$")); // \b Matches a word boundary, so it matches the beginning of a word and then matches any character exactly 5 times at the end of the String

        System.out.println("kitty".matches("\\W\\W\\W\\W\\W")); // \W Matches any non-word character exactly 5 times

        System.out.println("kitty".matches("\\D")); // \D Matches any non-digit character exactly 5 times

        System.out.println("kitty".matches("\\S")); // \S Matches any non-whitespace character exactly 5 times

        //
    }
}

package section4.regex;

public class RegExpressions1 {
    public static void main(String[] args) {
        System.out.println("Checking regular expressions in Java");
        System.out.println("Checking if cat matches cat: " + "cat".matches("cat")); // checks if the string matches exactly "cat"
        System.out.println("cat".matches("cat")); // checks if the string matches exactly "cat"
        System.out.println("cat".matches("Cat")); // checks if the string matches exactly "Cat" (case-sensitive, so it returns false)

        System.out.println("cat".matches("c.t")); // checks if the string matches "c.t" (where '.' can be any character)

        System.out.println("cat".matches("cat|dog")); // checks if the string matches either "cat" or "dog"

        System.out.println("cat".matches("Cat")); // checks if the string matches exactly "Cat" (case-sensitive, so it returns false)

        System.out.println("cat".matches("[Cc]at")); // checks if the string matches "cat" or "Cat"

        System.out.println("Cat".matches("[a-fA-F]at")); // checks if the string matches "Bat", "bat", "Cat", etc. (first letter can be any letter from a to f, case-insensitive)

        System.out.println("bat".matches("[^c]at")); // checks if the string matches "bat" (the '^' negates the character class, so it matches any character except 'c')

        System.out.println("Cat".matches("[^a-g]at")); // checks if the string matches "bat" (the character class matches any lowercase letter from a to z)
    }
}

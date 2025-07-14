package section3.text;

public class LearnStrings2 {
    public static void main(String[] args) {
        String myText = "Hello World! Here is my first text.";
        System.out.println(myText.replace("first", "nice"));

        System.out.println(myText.toUpperCase());
        System.out.println(myText.toLowerCase());

        String myEmptyText = "";
        System.out.println(myEmptyText.isEmpty()); // true, because the string is empty. Tells if the length of the string is 0.
        System.out.println(myEmptyText.isBlank()); // true, because the string is empty and contains no whitespace characters
    }
}

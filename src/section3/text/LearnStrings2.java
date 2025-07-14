package section3.text;

public class LearnStrings2 {
    public static void main(String[] args) {
        String myText = "Hello! Here is my first text.";
        System.out.println(myText.replace("first", "nice"));

        System.out.println(myText.replaceFirst("text", "message")); // replaces only the first occurrence of "text" in the string
        System.out.println(myText.replaceFirst("TEXT", "message")); // it is case-sensitive, so it won't replace "text" with "message" because "TEXT" is not found in the string

        System.out.println(myText.replace('e', 'a')); // replaces all occurrences of 'e' with 'a'

        System.out.println(myText.toUpperCase());
        System.out.println(myText.toLowerCase());

        String myEmptyText = "";
        String myBlankText = "   "; // contains only whitespace characters

        System.out.println(myEmptyText.isEmpty()); // true, because the string is empty. Tells if the length of the string is 0.
        System.out.println(myBlankText.isEmpty()); // false, because the string contains whitespace characters. Tells if the length of the string is 0.

        System.out.println(myEmptyText.isBlank()); // true, because the string is empty and contains no whitespace characters
        System.out.println(myBlankText.isBlank()); // true, because the string contains only whitespace characters. Tells if the string is empty or contains only whitespace characters.

        //check if a user input is not blank or empty when you save the information in a database
        // it's preferable to use isBlank() instead of isEmpty() because it checks for both empty and whitespace-only strings.
    }
}

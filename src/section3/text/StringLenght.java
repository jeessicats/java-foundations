package section3.text;

public class StringLenght {
    public static void main(String[] args) {

        String myText = "Today is a beautiful day and it is sunny";

        System.out.println(myText.length()); // prints the length of the string

        char[] chars = myText.toCharArray(); // converts the string to a character array

        System.out.println(chars[0]); // prints the first character of the string

        System.out.println(chars[myText.length() - 1]); // prints the last character of the string

        
    }
}

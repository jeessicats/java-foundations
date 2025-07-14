package section3.text;

public class Contains {
    public static void main(String[] args) {

        String myPhrase = "The quick brown fox jumps over the lazy dog";

        System.out.println(myPhrase.contains("quick")); // checks if the phrase contains the word "quick"

        System.out.println(myPhrase.contains("Quick")); // checks if the phrase contains the word "Quick" (case-sensitive, so it returns false)
    }
}

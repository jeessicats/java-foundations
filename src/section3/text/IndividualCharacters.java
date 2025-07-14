package section3.text;

public class IndividualCharacters {
    public static void main(String[] args) {
        String myText = "Blueberry";

        System.out.println(myText.charAt(3));

        System.out.println(myText.indexOf('e')); // returns the index of the first occurrence of 'e'

        System.out.println(myText.indexOf('e', 4)); // returns the index of the first occurrence of 'e' after index 4
    }
}

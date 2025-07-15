package section3.text;

public class StringConcatenation {
    public static void main(String[] args) {
        String myText = "Blueberrys are my favorite fruit";
        String myText2 = "and I love them with cream";

        // Concatenation using the + operator
        System.out.println(myText + " " + myText2); // the simple way to concatenate strings, it's just for a couple of strings, if you have more than two strings, it is better to use the concat() method or StringBuilder

        // Concatenation using the concat() method
        System.out.println(myText.concat(" ").concat(myText2)); // the concat() method concatenates two strings, but it does not add a space between them, so we need to add a space manually

        // Concatenation using StringBuilder
        StringBuilder finalString = new StringBuilder();

        finalString
                .append(myText)
                .append(" ")
                .append(myText2); // StringBuilder is more efficient for concatenating multiple strings, especially in loops or when dealing with large strings

        System.out.println(finalString.toString()); // convert StringBuilder to String using toString() method

        // Concatenation using String.buffer is similar to StringBuilder, but it is synchronized, which means it is thread-safe. It is generally slower than StringBuilder, so it is not recommended for single-threaded applications.

        StringBuffer finalStringBuffer = new StringBuffer();

        finalStringBuffer
                .append(myText)
                .append(" ")
                .append(myText2); // StringBuffer is more efficient for concatenating multiple strings, especially in loops or when dealing with large strings

        System.out.println(finalStringBuffer.toString()); // convert StringBuffer to String using toString() method

        // Concatenation using format method

        String formattedString = String.format("%s %s", myText, myText2); // the format() method is used to format strings, it is similar to printf() in C, it allows you to format strings with placeholders

        System.out.println(formattedString); // prints the formatted string

        // Concatenation using String.join() method

        String joinedString = String.join(" ", myText, myText2); // the join() method is used to join multiple strings with a delimiter, in this case, a space

        System.out.println(joinedString); // prints the joined string
    }



}

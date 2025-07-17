package section3.text;

public class CompareStrings {

    public static void main(String[] args) {
        String flavor1 = "Vanilla";
        String flavor2 = "Caramel";
        String flavor1Again = "vanilla";


        System.out.println("Comparing strings with compareTo method:");
        System.out.println(flavor1.compareTo(flavor2)); // compares the two strings lexicographically, so if flavor1 is lexicographically less than flavor2, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.
        System.out.println(flavor1.compareToIgnoreCase(flavor2)); // compares the two strings lexicographically, ignoring case differences. If flavor1 is lexicographically less than flavor2, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.

        System.out.println(flavor1.compareTo(flavor1Again)); // compares the two strings lexicographically, so if flavor1 is lexicographically less than flavor1Again, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.
        System.out.println(flavor1.compareToIgnoreCase(flavor1Again)); // compares the two strings lexicographically, ignoring case differences. If flavor1 is lexicographically less than flavor1Again, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.

        compareStringsIgnoreCase(flavor1, flavor1Again); // this method compares two strings lexicographically, ignoring case differences and returns the result


        System.out.println("Comparing strings with contentEquals method:");

        // The contentEquals its less sensitive than the equals method, it checks if the content of the two strings is equal, but it doesn't check if the case is the same.
        // String Buffer its not a string, its a mutable sequence of characters, so it can be modified after its creation.
        // The contentEquals method is used to compare the content of a String with a StringBuffer or StringBuilder object.

        boolean result = flavor1.contentEquals(flavor1Again); // the variable 'result' will hold the result of the comparison and the result it's not a sring, it's a boolean value.
        // But the println method expects a string, so we need to convert the boolean value to a string before printing it.

        System.out.println(result); // checks if the two strings are equal, considering case sensitivity. It returns true if they are equal, false otherwise.

        System.out.println(flavor1.equals(flavor1Again)); // checks if the two strings are equal, considering case sensitivity. It returns true if they are equal, false otherwise.

    }

    public static int compareStringsIgnoreCase(String str1, String str2) {
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        return lowerStr1.compareTo(lowerStr2); // compares the two strings lexicographically, ignoring case differences
    }
}

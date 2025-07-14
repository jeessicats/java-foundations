package section3.text;

public class CompareStrings {

    public static void main(String[] args) {
        String flavor1 = "Vanilla";
        String flavor2 = "Caramel";
        String flavor1Again = "vanilla";


        System.out.println(flavor1.compareTo(flavor2)); // compares the two strings lexicographically, so if flavor1 is lexicographically less than flavor2, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.
        System.out.println(flavor1.compareToIgnoreCase(flavor2)); // compares the two strings lexicographically, ignoring case differences. If flavor1 is lexicographically less than flavor2, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.

        System.out.println(flavor1.compareTo(flavor1Again)); // compares the two strings lexicographically, so if flavor1 is lexicographically less than flavor1Again, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.
        System.out.println(flavor1.compareToIgnoreCase(flavor1Again)); // compares the two strings lexicographically, ignoring case differences. If flavor1 is lexicographically less than flavor1Again, it returns a negative number; if they are equal, it returns 0; if flavor1 is greater, it returns a positive number.

        compareStringsIgnoreCase(flavor1, flavor1Again); // this method compares two strings lexicographically, ignoring case differences and returns the result

    }

    public static int compareStringsIgnoreCase(String str1, String str2) {
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        return lowerStr1.compareTo(lowerStr2); // compares the two strings lexicographically, ignoring case differences
    }
}

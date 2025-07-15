package section3.text;

public class IndexOf {
    public static void main(String[] args) {
        String wutheringHeights = "Whatever our souls are made of, his and mine are the same.";

        System.out.println(wutheringHeights.indexOf("souls")); // finds the index of the first occurrence of "souls", where it starts in the string

        System.out.println(wutheringHeights.indexOf('\u0057')); // finds the index of the first occurrence of the character 'W' (Unicode U+0057)
        System.out.println(wutheringHeights.lastIndexOf("a")); // finds the index of the last occurrence of "a"
        System.out.println(wutheringHeights.indexOf("a", 40)); // finds the index of the first occurrence of "a" after index 40

        // the indexOf it is use to find the position of a substring or character in a string and useful for parsing strings

        String phoneNumber = "(234) 333-5551";

        System.out.println(parseAreaCode(phoneNumber));

        System.out.println(parseExchange(phoneNumber));

        System.out.println(parseLineNumber(phoneNumber));
    }

    // Parses the area code from a phone number in the format "(234) 333-5551"
    public static String parseAreaCode(String areaCode) {
        int openParenthesis = areaCode.indexOf("(");
        int closeParenthesis = areaCode.indexOf(")");
        return areaCode.substring(openParenthesis + 1, closeParenthesis);
    }

    // Parses the exchange code from a phone number in the format "(234) 333-5551"
    public static String parseExchange(String phoneNumber) {
        int spaceIndex = phoneNumber.indexOf(" ");
        int hyphenIndex = phoneNumber.lastIndexOf("-");
        return phoneNumber.substring(spaceIndex + 1, hyphenIndex);
    }

    // Parses the line number from a phone number in the format "(234) 333-5551"
    public static String parseLineNumber(String phoneNumber) {
        int traceIndex = phoneNumber.lastIndexOf("-");
        return phoneNumber.substring(traceIndex + 1);
    }
}

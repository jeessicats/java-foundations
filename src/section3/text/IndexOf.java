package section3.text;

public class IndexOf {
    public static void main(String[] args) {
        String wutheringHeights = "Whatever our souls are made of, his and mine are the same.";

        System.out.println(wutheringHeights.indexOf("souls"));

        System.out.println(wutheringHeights.indexOf('\u0057'));
        System.out.println(wutheringHeights.lastIndexOf("a"));
        System.out.println(wutheringHeights.indexOf("a", 40));

        String phoneNumber = "(234) 333-5551";

        System.out.println(parseAreaCode(phoneNumber));

        System.out.println(parseExchange(phoneNumber));

        System.out.println(parseLineNumber(phoneNumber));
    }
    public static String parseAreaCode(String areaCode) {
        int openParenthesis = areaCode.indexOf("(");
        int closeParenthesis = areaCode.indexOf(")");
        return areaCode.substring(openParenthesis + 1, closeParenthesis);
    }

    public static String parseExchange(String phoneNumber) {
        int spaceIndex = phoneNumber.indexOf(" ");
        int hyphenIndex = phoneNumber.lastIndexOf("-");
        return phoneNumber.substring(spaceIndex + 1, hyphenIndex);
    }

    public static String parseLineNumber(String phoneNumber) {
        int traceIndex = phoneNumber.lastIndexOf("-");
        return phoneNumber.substring(traceIndex + 1);
    }
}

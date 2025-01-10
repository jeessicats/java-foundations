package section3.text;

public class Substring {
    public static void main(String[] args) {
        String catName = "matcha";
        String caNameUpper = catName.substring(0,1).toUpperCase() + catName.substring(1);
        System.out.println(caNameUpper);

        String name = "willow";
        String firstUpperLetter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1);
        String myName = firstUpperLetter.concat(rest);

        System.out.println(myName);

        String anotherName = "bilbo";
        String firstUpperLetter2 = anotherName.substring(0, 1).toUpperCase();
        String rest2 = anotherName.substring(1);
        int capacity = firstUpperLetter2.length() + rest2.length();
        String nameCapitalized = new StringBuilder(capacity)
                .append(firstUpperLetter2)
                .append(rest2)
                .toString();
        System.out.println(nameCapitalized);
    }
}

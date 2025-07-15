package section3.text;

public class Substring {
    public static void main(String[] args) {
        String catName = "matcha";
        String caNameUpper = catName.substring(0,1).toUpperCase() + catName.substring(1); // substrings the first letter and converts it to uppercase, then concatenates it with the rest of the string
        //substring method takes two parameters: the starting index (inclusive) and the ending index (exclusive) and gives you a new string that is a part of the original string
        System.out.println(caNameUpper);

        String name = "willow";
        String firstUpperLetter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1);
        String myName = firstUpperLetter.concat(rest);

        // to rename a variable, you can use the shortcut shift + f6 in IntelliJ IDEA

        System.out.println(myName);

        String anotherName = "bilbo";
        String firstUpperLetter2 = anotherName.substring(0, 1).toUpperCase();
        String anotherRest = anotherName.substring(1);
        int totalLenght = firstUpperLetter2.length() + anotherRest.length(); // this line of code calculates the length of the new string that will be created by concatenating the first uppercase letter and the rest of the string
        String nameCapitalized = new StringBuilder(totalLenght)
                .append(firstUpperLetter2)
                .append(anotherRest)
                .toString();
        System.out.println(nameCapitalized);
    }
}

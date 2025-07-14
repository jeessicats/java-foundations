package section3.text;

public class LearnStrings {
    public static void main(String[] args) {

        String theBlueColor = "blue"; // a reference to the word "blue" is stored in the variable color
        String anotherBlueColor = "blue"; //string literals are stored in a special area of memory called the string pool.

        System.out.println(theBlueColor == anotherBlueColor); // true, because both variables point to the same string literal in the string pool
        System.out.println(theBlueColor.equals(anotherBlueColor)); // true, because the content of both strings is the same

        String thePurpleColor = new String("purple"); // Strings are classes in Java, that's why we can use new keyword
        String anotherPurple = new String("purple"); // Strings are classes in Java, that's why we can use new keyword

        System.out.println(thePurpleColor == anotherPurple); // false, because both variables point to different string objects in the heap
        System.out.println(thePurpleColor.equals(anotherPurple)); // true, because the content of both strings is the same

        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit); // Apontam para o mesmo endereço

        System.out.println(vegetable == anotherVegetable); //Não apontam para o mesmo endereço
    }
}

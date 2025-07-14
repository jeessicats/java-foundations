package section2.methods;


// Class is a blueprint for creating objects.
// An object is an instance of a class.
// A class can have methods, which are functions that belong to the class.
public class Person {
    private String middleName = "Alan";

    public void sayHello() {
        System.out.println("Hello!"); // statment
    }

    public void saySomething(String message) {
        System.out.println(message); // statement
    }

    public char getFirstLetterOfMiddleName() {
        return middleName.charAt(0); // statement
    }

    public int addToNumbers(int number1, int number2) {
        return number1 + number2; // statement
    }

    public void test(String[] words) {
        // This method is not used in the main method, but it can be used to test passing an array of strings.
    }

    public void test2(int number, String... words) { // varargs -> the varargs has to be the last parameter in the method signature
        // This method is not used in the main method, but it can be used to test passing a variable number of string arguments.
        // varargs are just arrays, so you can use them like arrays.
    }

    public static void main(String[] args) { // entry point of the program. THE PROGRAM STARTS FROM HERE.
        Person person = new Person();

        person.sayHello();

        person.saySomething("I'm saying something right now!");
        person.saySomething("This is another message.");

        System.out.println(person.getFirstLetterOfMiddleName());

        int sum = person.addToNumbers(5, 10);
        System.out.println("The sum is: " + sum);

        String[] words = new String[]{"Hello", "World", "Java"};
        person.test(words);

        person.test2(1, "Hello", "World", "Java");
    }
}

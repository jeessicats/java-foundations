package controlflow;

import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {

        // Generate a random number between 1 and 10 using Random class that is part of the java.util package and its better than Math.random()
        int randomNumber = new Random().nextInt(10) + 1;

        // Print the generated random number using printf for formatted output where %d is a placeholder for an integer and %n is a placeholder for a new line
        // d stands for decimal integer
        System.out.printf("Generated number is: %d%n", randomNumber);

        // Check if the random number is equal to 1
        // == equals operator is used to compare primitive types like int
        // != not equals operator is used to compare primitive types like int
        if (randomNumber == 1) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, not this time!");
        }

        // Check if the random number is less than or equal to 2, even, or odd
        if (randomNumber <= 2) {
            System.out.println("The color is red");

            // number % 2 == 0 checks if the number is even, if it is, it will print "The color is green"
            // && is the logical AND operator, it checks if both conditions are true
            // || is the logical OR operator, it checks if at least one condition is true

        } else if (randomNumber > 2 && (randomNumber % 2 == 0)) {
            System.out.println("The color is blue");
        } else {
            System.out.println("The color is yellow");
        }

        String command = null;

        // Check if the command is null or empty
        if ("go".equals(command)) {
            System.out.println("Going");
        } else if ("stop".equals(command)) {
            System.out.println("Stopping");
        } else {
            System.out.println("Unknown command: " + command);
        }
    }
}

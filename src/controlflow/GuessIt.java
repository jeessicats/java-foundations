package controlflow;

import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1;

        System.out.printf("Generated number is: %d%n", randomNumber);

        if (randomNumber == 1) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, not this time!");
        }

        if (randomNumber <= 2) {
            System.out.println("The color is red");
        } else if (randomNumber > 2 && (randomNumber % 2 == 0)) {
            System.out.println("The color is blue");
        } else {
            System.out.println("The color is yellow");
        }

        String command = null;

        if ("go".equals(command)) {
            System.out.println("Going");
        } else if ("stop".equals(command)) {
            System.out.println("Stopping");
        } else {
            System.out.println("Unknown command: " + command);
        }
    }
}

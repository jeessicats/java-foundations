package controlflow;

import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {

        // This program generates a random number between 1 and 10 and prompts the user to guess the number.
        // Here we are first generating a random number between 1 and 10 using Random class.
        int randomNumber = new Random().nextInt(10) + 1;

        // Here we are setting a guessNumberStr variable to null, which will be used to store the user's input.
        String guessNumberStr = null;

        // we need to do !"q".equals(guessNumberStr) because we want to keep the loop running until the user enters 'q' to quit
        // this prevents problems with null pointer exceptions, as guessNumberStr is initially null
        while (!"q".equals(guessNumberStr)) {

            // Using System.console() to read input from the console, reads input until the user enters 'q' to quit
            // returns a String input
            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");

            // this if block checks if the key pressed is 1 or 2 digits long, and if it is a valid integer (positive or negative)
            // so this block is just going to be executed if the user enters a valid digit

            // its important don't put a lot of nesting if statements, because it makes the code harder to read and understand
            // so always try to keep the code as simple as possible, and use early returns or continue statements to avoid deep nesting

            if (guessNumberStr.matches("-?\\d{1,2}")) {
                // here we parse the input string to an integer so we can compare it with the random number
                int guessNumberInt = Integer.parseInt(guessNumberStr);

                if (guessNumberInt == randomNumber) {
                    System.out.printf("The number is %d. You got it!%n", randomNumber);
                    return;
                } else {
                    System.out.printf("You didn't get it!%n");
                }
            }
        }

    }
}

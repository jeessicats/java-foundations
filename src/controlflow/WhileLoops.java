package controlflow;

import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {

        // This program generates a random number between 1 and 10 and prompts the user to guess the number.
        // Here we are first generating a random number between 1 and 10 using Random class.
        int randomNumber = new Random().nextInt(10) + 1;

        // Here we are setting a guessNumberStr variable to null, which will be used to store the user's input.
        String guessNumberStr = null;

        while (!"q".equals(guessNumberStr)) {

            // Using System.console() to read input from the console, reads input until the user enters 'q' to quit
            // returns a String input
            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");

            // here we parse the input string to an integer so we can compare it with the random number
            int guessNumberInt = Integer.parseInt(guessNumberStr);

            if (guessNumberStr.matches("-?\\d{1,2}")) {

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

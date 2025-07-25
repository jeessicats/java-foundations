package controlflow;

import java.util.Random;

public class DoWhileGuessGame {

    // Maximum number of attempts allowed for guessing the number
    public static final int MAX_ALLOWED_TRIES = 5;

    public static void main(String[] args) {

        // This program generates a random number between 1 and 10 and prompts the user to guess the number.
        int randomNumber = new Random().nextInt(10) + 1;
        System.out.printf("The random number is %d%n", randomNumber);
        String guessNumberStr = null;

        // here the attempts variable is initialized to 1, which will be used to count the number of attempts made by the user
        // it has to be declared outside the loop so that it can be accessed after the loop ends and to keep track of the number of attempts made by the user
        int attempts = 1;

        // Using do-while loop to ensure that the user is prompted at least once to enter a guess
        do {

            // Using System.console() to read input from the console, reads input until the user enters 'q' to quit
            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");

            // Check if the input is a valid integer (1 or 2 digits long, positive or negative)
            if (guessNumberStr.matches("-?\\d{1,2}")) {

                // Parse the input string to an integer so we can compare it with the random number
                int guessNumber = Integer.parseInt(guessNumberStr);

                // Check if the guessed number matches the random number
                if (guessNumber == randomNumber) {
                    // If the guess is correct, print the number and the number of attempts taken

                    // the ? and : are the ternary operator, which is a shorthand for an if-else statement and means that if attempts is equal to 1, it will return "try", otherwise it will return "tries"
                    String tryStr = attempts == 1 ? "try" : "tries";

                    // here we print the random number, the number of attempts made, and whether it was a single try or multiple tries
                    System.out.printf("The number is %d. You got it in %d %s!%n", randomNumber, attempts, tryStr);
                    return;
                } else {

                    // If the guess is incorrect, increment the attempts counter and print a message
                    attempts++;

                    // Print a message indicating that the guess was incorrect
                    System.out.printf("You didn't get it!%n");

                    // Check if the maximum number of attempts has been reached
                    if (attempts > MAX_ALLOWED_TRIES) {
                        // If the maximum attempts are exceeded, print the number of attempts and the random number, then exit the program
                        System.out.printf("You tried %d times. The random number is %d. Ending program now. %n", attempts-1, randomNumber);
                        return;
                    }
                }
            }
            // If the input is not a valid integer, print an error message
            else {
                System.out.println("Invalid input! Please enter a valid number between 1 and 10 or 'q' to quit.");
            }


        }
        // The loop continues until the user enters 'q' to quit or the maximum number of attempts is reached
        while (!"q".equals(guessNumberStr));

    }
}

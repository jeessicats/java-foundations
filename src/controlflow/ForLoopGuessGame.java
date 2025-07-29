package controlflow;

import java.util.Random;

public class ForLoopGuessGame {

    public static final int MAX_ALLOWED_TRIES = 5;

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1;
        System.out.printf("The random number is %d%n", randomNumber);
        String guessNumberStr = null;

        // Using a for loop to limit the number of attempts to guess the number
        // The loop will run for a maximum of MAX_ALLOWED_TRIES times
        // The loop variable attempts starts at 1 and increments by 1 each time the loop runs
        // The loop will exit if the user guesses the number correctly or if the maximum number of attempts is reached
        // The loop will run as long as attempts is less than or equal to MAX_ALLOWED_TRIES
        for (int attempts = 1; attempts <= MAX_ALLOWED_TRIES; attempts++) {
            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");
            if (guessNumberStr.matches("-?\\d{1,2}")) {
                int guessNumber = Integer.parseInt(guessNumberStr);

                if (guessNumber == randomNumber) {
                    String tryStr = attempts == 1 ? "try" : "tries";
                    System.out.printf("The number is %d. You got it in %d %s!%n", randomNumber, attempts, tryStr);
                    break; // we use break to exit the loop if the user guesses the number correctly
                    // return is not used here because we want to keep the loop running until the user guesses the number or reaches the maximum number of attempts
                    // break is used with all kinds of loops, not just for loops

                    // the continue can be used to skip the current iteration of the loop and move to the next iteration, but in this case, we don't need it
                } else {
                    if (attempts == MAX_ALLOWED_TRIES) {
                        System.out.printf("You tried %d times. The random number is %d. Ending program now. %n", attempts, randomNumber);
                        return;
                    } else {
                        System.out.printf("You didn't get it!%n");
                    }
                }
            }
        }
    }
}

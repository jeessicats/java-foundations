package controlflow;

import java.util.Random;

public class DoWhileGuessGame {
    public static final int MAX_ALLOWED_TRIES = 5;

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1;
        System.out.printf("The random number is %d%n", randomNumber);
        String guessNumberStr = null;

        int attempts = 1;
        do {
            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");
            if (guessNumberStr.matches("-?\\d{1,2}")) {
                int guessNumber = Integer.parseInt(guessNumberStr);

                if (guessNumber == randomNumber) {
                    String tryStr = attempts == 1 ? "try" : "tries";
                    System.out.printf("The number is %d. You got it in %d %s!%n", randomNumber, attempts, tryStr);
                    return;
                } else {
                    attempts++;
                    System.out.printf("You didn't get it!%n");
                    if (attempts > MAX_ALLOWED_TRIES) {
                        System.out.printf("You tried %d times. The random number is %d. Ending program now. %n", attempts-1, randomNumber);
                        return;
                    }
                }
            }
        }  while (!"q".equals(guessNumberStr));

    }
}

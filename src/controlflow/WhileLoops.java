package controlflow;

import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(10) + 1;
        String guessNumberStr = null;

        while (!"q".equals(guessNumberStr)) {

            guessNumberStr = System.console().readLine("Enter a number between 1 and 10: ");
            if (guessNumberStr.matches("-?\\d{1,2}")) {
                int guessNumber = Integer.parseInt(guessNumberStr);

                if (guessNumber == randomNumber) {
                    System.out.printf("The number is %d. You got it!%n", randomNumber);
                    return;
                } else {
                    System.out.printf("You didn't get it!%n");
                }
            }
        }

    }
}

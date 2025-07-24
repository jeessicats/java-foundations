package controlflow;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(5) + 1;

        System.out.printf("Generated number is: %d%n", randomNumber);

        // With switch statement there is no logic like there is with if-else statements.
        switch (randomNumber) {
            case 1:
                System.out.println("First number");
                break;
                // break is used to exit the switch block, I need to use it to prevent fall-through behavior
                // fall-through behavior means that if I don't use break, the code will continue to execute the next case even if it doesn't match
                // fall-through behavior is useful in some cases, but in this case I want to prevent it
            case 2:
                System.out.println("Second number");
                break;
            case 3:
                System.out.println("Third number");
                break;
            default:
                System.out.println("Invalid number");
        }

        String command = null;

        // switch statement is more readable than if-else statements when there are many conditions to check and also more efficient
        // but it is not as flexible as if-else statements, because it only works with specific types of values (like int, String, etc.)
        // there is no easy way to protect against null values in switch statements, so I need to check for null before using it using a if statement
        if (command != null) {
            switch (command) {
                case "go":
                    System.out.println("Going to switch");
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        if ("go".equals(command)) {
            System.out.println("Going to if");
        } else {
            System.out.println("Invalid command");
        }
    }
}

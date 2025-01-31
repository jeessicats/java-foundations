package controlflow;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(5) + 1;

        System.out.printf("Generated number is: %d%n", randomNumber);

        switch (randomNumber) {
            case 1:
                System.out.println("First number");
                break;
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

        switch (command) {
            case "go":
                System.out.println("Going to switch");
                break;
            default:
                System.out.println("Invalid command");
                break;
        }
    }
}

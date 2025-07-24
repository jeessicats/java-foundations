package controlflow;

public class BlackJackGame {
    public static void main(String[] args) {
        String card = "jack";

        int currentTotalValue = 10;

        int currentValue = switch (card) {
            // using an arrow function to return a value is more concise and can be more readable
            // but it requires Java 12 or later
            // i can also use a , to separate multiple cases with the same value, like this:
            case "king", "queen", "jack" -> 10;

            // with a case label, I can use a block to execute multiple statements
            // and return a value using yield
            // if the currentTotalValue is less than or equal to 10, it will yield 11, otherwise it will yield 1
            // here we don't use the word return, instead we use yield to return a value from the block, return is used in just in methods or functions

            case "a", "A" -> {
                if (currentTotalValue <= 10) {
                    yield  11;
                } else {
                    yield  1;
                }
            }
            default -> Integer.parseInt(card);
        };

        // sout is a shortcut for System.out.println in IntelliJ IDEA
        // souft is a shortcut for System.out.printf in IntelliJ IDEA
        
        System.out.printf("Current card value is %d%n", currentValue);
        System.out.printf("Total value: %d%n", currentTotalValue + currentValue);
    }
}

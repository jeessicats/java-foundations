package controlflow;

public class BlackJackGame {
    public static void main(String[] args) {
        String card = "jack";

        int currentTotalValue = 10;

        int currentValue = switch (card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (currentTotalValue <= 10) {
                    yield  11;
                } else {
                    yield  1;
                }
            }
            default -> Integer.parseInt(card);
        };

        System.out.printf("Current card value is %d%n", currentValue);
        System.out.printf("Total value: %d%n", currentTotalValue + currentValue);
    }
}

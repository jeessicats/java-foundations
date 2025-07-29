package controlflow;

public class MyForLoop {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Pineapple", "Grape", "Strawberry", "Blueberry"};

        for (int counter = 0; counter < fruits.length; counter++) {
            System.out.printf("Fruit at index %d is %s\n", counter, fruits[counter]);
        }

        // Enhanced for loop (also known as for-each loop) to iterate over the array
        // This loop is more concise and easier to read, especially for arrays and collections
        // It automatically iterates through each element in the array without needing an index variable.
        // the fruit variable will take the value of each element in the fruits array one by one, I can name it whatever I want, it doesn't have to be fruit
        for (String fruit : fruits) {
            System.out.printf("Fruit is %s\n", fruit);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("Current number is %d\n", i);
        }
    }
}

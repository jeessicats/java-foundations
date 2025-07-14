package controlflow;

public class MyForLoop {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Pineapple"};

        for (int counter = 0; counter < fruits.length; counter++) {
            System.out.printf("Fruit at index %d is %s\n", counter, fruits[counter]);
        }

        for (String fruit : fruits) {
            System.out.printf("Fruit is %s\n", fruit);
        }
    }
}

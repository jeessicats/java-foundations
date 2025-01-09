package section3.people;

public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit); // Apontam para o mesmo endereço

        System.out.println(vegetable == anotherVegetable); //Não apontam para o mesmo endereço
    }
}

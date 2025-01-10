package section3.text;

public class Equality {
    public static void main(String[] args) {
        String first = "Blueblerry";
        String second = "Blueblerry";
        StringBuilder third = new StringBuilder("Blueblerry");

        System.out.println(first.contentEquals(second));

        System.out.println(first.equals(second));

        System.out.println(first.equals(third));

        System.out.println(first.contentEquals(third));
    }
}

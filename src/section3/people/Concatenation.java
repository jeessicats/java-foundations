package section3.people;

public class Concatenation {
    public static void main(String[] args) {
        String text = "Hello World";
        String anotherText = "My name is Olivia Willow";

        System.out.println(text + " " + anotherText);

        System.out.println(text.concat(anotherText));

        String finalText = new StringBuilder()
                .append(text)
                .append(" ")
                .append(anotherText)
                .toString(); //Mais eficiente em termos de memória quando precisa concatenar muitas strings
        System.out.println(finalText);

        System.out.printf("%s %s\n", text, anotherText);
        String anotherStringFinal = String.format("%s %s", text, anotherText);
        System.out.println(anotherStringFinal);
    }
}

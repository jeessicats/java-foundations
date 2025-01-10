package section3.text;

public class Split {
    public static void main(String[] args) {
        String exemple = """
                Alice,Johnson,1990-04-15,123 Maple Street,Springfield,IL
                Bob,Smith,1985-08-22,456 Oak Avenue,Riverside,CA
                Clara,Evans,1992-01-09,789 Pine Drive,Lincoln,NE
                Daniel,Moore,1980-12-31,321 Cedar Lane,Boulder,CO
                Emily,Clark,1995-06-18,654 Birch Road,Salem,OR
                """;

        String[] people = exemple.split("\n");

        System.out.println(people.length);
        System.out.println(people[4]);
        String[] emily = people[4].split(",");
        System.out.println(emily.length);
        System.out.println(emily[3]);
    }
}

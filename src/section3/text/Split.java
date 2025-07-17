package section3.text;

public class Split {
    public static void main(String[] args) {

        // This program demonstrates how to split a string into an array of substrings
        // using the split method. It also shows how to access individual elements
        // of the resulting array and how to further split a specific element into
        // its components.

        // The example string contains information about people, with each person's
        String exemple = """
                Alice,Johnson,1990-04-15,123 Maple Street,Springfield,IL
                Bob,Smith,1985-08-22,456 Oak Avenue,Riverside,CA
                Clara,Evans,1992-01-09,789 Pine Drive,Lincoln,NE
                Daniel,Moore,1980-12-31,321 Cedar Lane,Boulder,CO
                Emily,Clark,1995-06-18,654 Birch Road,Salem,OR
                """;

        String[] people = exemple.split("\n"); // splits the string into an array of substrings, each representing a person

        System.out.println(people.length); // prints the number of people in the list
        System.out.println(people[4]); // prints the details of the fifth person in the list

        String[] emily = people[4].split(","); // splits the details of Emily into an array of substrings

        System.out.println(emily.length); // prints the number of details about Emily
        System.out.println(emily[0]); // prints Emily's first name
        System.out.println(emily[1]); // prints Emily's last name
        System.out.println(emily[2]); // prints Emily's birth date
        System.out.println(emily[3]); // prints Emily's address
        System.out.println(emily[4]); // prints Emily's city
        System.out.println(emily[5]); // prints Emily's state


        // The split method is useful for parsing structured data, such as CSV files,
        // where each line contains multiple fields separated by a specific delimiter (in this case, a comma).
        // It allows you to easily extract individual pieces of information from a string.
        // Note: The split method uses regular expressions, so if you want to split by a literal
        // character, you need to escape it if it has a special meaning in regex (e.g., ".", "*", "+", etc.).
    }
}

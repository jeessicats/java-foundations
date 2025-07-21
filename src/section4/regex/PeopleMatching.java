package section4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {
    public static void main(String[] args) {
        String people = """
            Einstein, Albert, 03/14/1879
            Monroe, Marilyn, 06/01/1926
            Tesla, Nikola, 07/10/1856
            Curie, Marie, 11/07/1867
            Chaplin, Charlie, 04/16/1889
            """;

        // + is used to match one or more occurrences of the preceding element
        // //w matches any word character (alphanumeric or underscore)
        // \\n matches a newline character

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dateOfBirth>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(people);

        // The matcher.find() method searches for the next subsequence of the input sequence that matches the pattern.
        // It returns true if a subsequence of the input sequence matches the pattern, and false otherwise.
        // it's different form using matcher.matches() which checks if the entire input sequence matches the pattern.
        while (matcher.find()) {
            System.out.printf("First Name: %s; Last Name: %s; Date of Birth: %s;%n", matcher.group("firstName"), matcher.group("lastName"), matcher.group("dateOfBirth"));
        }


    }

}

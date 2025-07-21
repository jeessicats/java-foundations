package section4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTextDocument {
    public static void main(String[] args) {

        // Example of parsing a text document using regex to extract student information
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* #Grab student number - .* matches any character 0 or more times, doesn't include new line or carriage return, thats why we use DOTALL
                Grade:\\s+(?<grade>\\d{1,2}).* #Grab student grade - \\d{1,2} matches 1 or 2 digits, \\s+ matches one or more whitespace characters
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* #Grab student birthdate - \\d{2} matches 2 digits, \\d{4} matches 4 digits, and the / is a literal character
                Gender:\\s+(?<gender>\\w+)\\b.* #Grab student grade - \\w+ matches one or more word characters (letters, digits, or underscores), and \\b is a word boundary to ensure we match the whole word
                State\\sID:\\s+(?<stateId>\\d{10})\\b.* #Grab student grade - \\d{10} matches exactly 10 digits, and \\b is a word boundary to ensure we match the whole word
                Cumulative\\sGPA\\s\\(Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* #Grab student grade - [\\d\\.]+ matches one or more digits or dots, allowing for decimal numbers
                Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.]+)\\b.* #Grab student grade - [\\d\\.]+ matches one or more digits or dots, allowing for decimal numbers
                """;

        // Pattern.DOTALL allows the dot (.) to match new line characters, and Pattern.COMMENTS allows whitespace and comments in the regex for better readability
        // Pattern.COMMENTS allows whitespace and comments in the regex for better readability

        // Flags in computer is something that you can turn on or off to change the behavior of the regex engine.
        // The pipe (|) is used to combine multiple flags, it means that the regex engine will use both flags at the same time.

        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(transcript);

        if (matcher.matches()) {
            System.out.println(matcher.group("studentNumber"));
            System.out.println(matcher.group("grade"));
            System.out.println(matcher.group("birthMonth"));
            System.out.println(matcher.group("birthDay"));
            System.out.println(matcher.group("birthYear"));
            System.out.println(matcher.group("gender"));
            System.out.println(matcher.group("stateId"));
            System.out.println(matcher.group("weightedGPA"));
            System.out.println(matcher.group("unweightedGPA"));

        }
    }
}

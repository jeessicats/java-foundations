package section4.expressions;

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

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dateOfBirth>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(people);

        matcher.find(15);
        System.out.println(matcher.group("lastName"));
        System.out.println(matcher.group("firstName"));
        System.out.println(matcher.group("dateOfBirth"));

        System.out.println(matcher.start());
        System.out.println(matcher.end());


    }

}

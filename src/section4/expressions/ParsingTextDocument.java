package section4.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTextDocument {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* #Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* #Grab student grade
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* #Grab student birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* #Grab student grade
                State\\sID:\\s+(?<stateId>\\d{10})\\b.* #Grab student grade
                Cumulative\\sGPA\\s\\(Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* #Grab student grade
                Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.]+)\\b.* #Grab student grade
                """;

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

package section3.text;

public class BeginEndStrings {
    public static void main(String[] args) {
        String fileName = "  file001.txt".strip();

        System.out.println(fileName.endsWith("txt"));

        System.out.println(fileName.endsWith("doc"));

        System.out.println(fileName.startsWith("file"));
    }
}

package section3.text;

public class BeginEndStrings {
    public static void main(String[] args) {
        String fileName = "  file001.txt".strip(); // removes leading and trailing whitespace
        String anotherFileName = " file002.doc"; // contains leading whitespace

        System.out.println(fileName.endsWith(".txt")); // checks if the string ends with "txt"

        System.out.println(fileName.endsWith(".doc")); // checks if the string ends with "doc"
        System.out.println(anotherFileName.endsWith(".doc")); // checks if the string ends with "doc"

        System.out.println(fileName.startsWith("file")); // checks if the string starts with "file"
        System.out.println(anotherFileName.strip().startsWith("file")); // checks if the string starts with "file" after stripping whitespace

        // The strip() method is used to remove leading and trailing whitespace from the string, it retursn a new string with the whitespace removed.
    }
}

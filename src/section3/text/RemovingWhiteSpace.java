package section3.text;

public class RemovingWhiteSpace {
    public static void main(String[] args) {
        String firstName = "    Jane   ";
        System.out.format("'%s' ", firstName.strip()); //Remove espaço do começo e do final -> removes both leading and trailing spaces
        System.out.format("'%s' ", firstName.stripLeading()); //Remove espaço apenas do começo -> removes the leading space
        System.out.format("'%s' ", firstName.stripTrailing()); //Remove espaço apenas no final -> removes the trailing space

        System.out.format("'%s'", firstName.stripIndent()); //Remove espaços do começo de cada linha, mas não do final -> removes leading spaces from each line but not the trailing spaces

        String poem = """
                Once upon a midnight dreary, while I pondered, weak and weary,
                Over many a quaint and curious volume of forgotten lore—
                While I nodded, nearly napping, suddenly there came a tapping,
                As of some one gently rapping, rapping at my chamber door.
                'Tis some visitor,' I muttered, 'tapping at my chamber door—
                Only this and nothing more.'
                
                The Raven" de Edgar Allan Poe
                """;

        System.out.println("");
        System.out.format("'%s' ", poem.stripIndent());
        System.out.format("'%s' ", firstName.trim()); //Faz basicamente o mesmo que split, é um metodo mais antigo
        // split is new and more efficient than trim, but trim is still used in some cases. trim methot it is not very intelligent, black spaces are diferent in diferent languages, so it is not very reliable.

        String newPoem = removeWhiteSpaces(poem); // This method removes all spaces from the text, not just leading or trailing spaces

        System.out.println(newPoem);
    }

    public static String removeWhiteSpaces(String text) { // This method needs to be static because it is called from a static context (the main method), so we can use it without creating an instance of the class.
        return text.replace(" ", "");
    }
}


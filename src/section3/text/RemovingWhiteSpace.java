package section3.text;

public class RemovingWhiteSpace {
    public static void main(String[] args) {
        String firstName = "    Olivia   ";
        System.out.format("'%s' ", firstName.strip()); //Remove espaço do começo e do final
        System.out.format("'%s' ", firstName.stripLeading()); //Remove espaço apenas do começo
        System.out.format("'%s' ", firstName.stripTrailing()); //Remove espaço apenas no final

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

    }

}

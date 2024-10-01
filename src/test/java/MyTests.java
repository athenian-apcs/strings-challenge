import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    @Test
    public void testExistsAsWord() {
        assertTrue(MyMain.existsAsWord("taco", "I would love to eat a taco right now."));
        assertTrue(MyMain.existsAsWord("Boxes", "Boxes are often used to contain packages."));
        assertTrue(MyMain.existsAsWord("cat", "But is a tacocat really a cat?"));
        assertTrue(MyMain.existsAsWord("life", "life"));

        assertFalse(MyMain.existsAsWord("taco", "tacocat"));
        assertFalse(MyMain.existsAsWord("word", ""));
        assertFalse(MyMain.existsAsWord("bit", "Frodo is a hobbit from the shire."));
        assertFalse(MyMain.existsAsWord("Jumps", "Jesper jumps constantly."));
    }
}

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LetterCaseTest {
    LetterCase letterCase = new LetterCase();
    @Test
    void splitWord() {
        String testWord = "hello world ";
        assertEquals("[hello, world]", Arrays.toString(letterCase.splitWord(testWord)));
    }

    @Test
    void divideLetterCase() {
    }

    @Test
    void checkBlank() {
    }
}
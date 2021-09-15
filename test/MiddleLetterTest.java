import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleLetterTest {
    MiddleLetter middleLetter = new MiddleLetter();

    @Test
    void solution() {
        String word = "abcde";
        assertEquals("c", middleLetter.solution(word));
    }
}
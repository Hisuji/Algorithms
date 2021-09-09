import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LetterCaseTest {
    LetterCase letterCase = new LetterCase();
    @Test
    void solutionTest() {
        String testWord = "try hello world";
        assertEquals("TrY HeLlO WoRlD", letterCase.solution(testWord));
    }

}
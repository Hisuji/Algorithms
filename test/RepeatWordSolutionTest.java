import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatWordSolutionTest {
    RepeatWordSolution repeatWord = new RepeatWordSolution();

    @Test
    void solution() throws Exception{
//        assertEquals(repeatWord.solution(10), "수박수박수박수박수박");
        assertThrows(Exception.class, () -> {
                repeatWord.solution(10001);
        });
    }

    @Test
    void checkNumberLength() {
        assertEquals(repeatWord.checkNumberLength(10001), false);
    }

    @Test
    void writeWord() {
        assertEquals(repeatWord.writeWord(10), "수박수박수박수박수박");
    }
}
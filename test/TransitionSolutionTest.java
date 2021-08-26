import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransitionSolutionTest {
    TransitionSolution transitionSolution = new TransitionSolution();

    String successWord = "-234";
    String failureWord = "02345678";

    @Test
    void 문자열_길이_확인() {
        assertEquals(true, transitionSolution.checkLength(successWord));
    }

    @Test
    void 문자열_구성_확인() {
        assertEquals(true, transitionSolution.checkLength(successWord));
    }

    @Test
    void solution() {
        assertEquals(-234, transitionSolution.solution(successWord));
    }
}
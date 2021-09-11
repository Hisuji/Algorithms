import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {

    Comparison comparison = new Comparison();
    @Test
    void p와y의개수비교하기() {
        boolean result = comparison.solution("ppooo");
        assertEquals(false, result);
    }
}
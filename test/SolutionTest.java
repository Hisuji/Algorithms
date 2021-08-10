import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution solution;

    int[] trulyArr = {1, 2, 3, 4};
    int[] falsyLengthArr = {};
    int[] falsyRangeArr = {1, 23000, 5};

    @Test
    public void testSolution() {
        solution = new Solution();
        assertEquals(solution.solution(trulyArr), 2.5);
    }

    @Test
    public void testCheckLength() {
        solution = new Solution();
        assertEquals(solution.checkLength(falsyLengthArr), false);
    }

    @Test
    public void testcheckRange() {
        solution = new Solution();
        assertEquals(solution.checkRange(falsyRangeArr), false);
    }
}
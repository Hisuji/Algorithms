import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DistinctNumberTest {
    DistinctNumber number = new DistinctNumber();
    int[] inputNumber = {1, 1, 3, 3, 0, 1, 1};

    @Test
    void 중복제거하기() {
        int[] outputNumber = {1, 3, 0, 1};
        assertEquals(Arrays.toString(outputNumber), Arrays.toString(number.distinct(inputNumber)));
    }

}
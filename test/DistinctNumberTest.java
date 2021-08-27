import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DistinctNumberTest {
    DistinctNumber number = new DistinctNumber();
    int[] inputNumber = {6, 7, 7, 2, 1, 3};

    @Test
    void 중복제거하기() {
        int[] outputNumber = {6, 7, 2, 1, 3};
        assertEquals(Arrays.toString(outputNumber), Arrays.toString(number.distinct(inputNumber)));
    }

}
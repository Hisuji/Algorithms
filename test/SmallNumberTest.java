import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmallNumberTest {

    @Test
    void solution() {
        //Given
        SmallNumber smallNumber = new SmallNumber();
        int[] arr = {4, 3, 2, 1};

        //When
        int[] actualResult = smallNumber.solution(arr);

        //Then
        assertEquals("[4, 3, 2]", Arrays.toString(actualResult));
    }
}
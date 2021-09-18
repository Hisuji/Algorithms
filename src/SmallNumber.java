import javax.management.loading.MLet;
import java.util.*;

public class SmallNumber {
    public int[] solution(int[] arr) {
        int[] result = {};

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        int length = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min <= arr[i]) {
                length++;
                continue;
            } else {
                min = arr[i];
                length++;
            }
        }

        result = new int[length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}
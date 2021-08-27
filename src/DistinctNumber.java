import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DistinctNumber {
    // 숫자 배열에서 중복되는 숫자는 전부 제거하고 출력, 출력 순서는 배열 순서 그대로 유지
    public static void main(String[] args) {
        int[] testArr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = new DistinctNumber().distinct(testArr);
        System.out.println(Arrays.toString(result));

    }

    public int[] distinct(int[] arr) {
        int[] answer = {};

        List<Integer> inputArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ((i <= arr.length - 2)
                    && (arr[i] != arr[i + 1])) {
                inputArr.add(arr[i]);
            } else if (i == arr.length - 1) {
                inputArr.add(arr[i]);
            }
        }
        answer = inputArr.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}

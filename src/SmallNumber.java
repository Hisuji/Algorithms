import java.util.Arrays;
import java.util.Optional;

public class SmallNumber {
    public int[] solution(int[] arr) {
        int[] newArr = Arrays.stream(arr).filter(num -> num != Arrays.stream(arr).min().getAsInt()).toArray();
        if (newArr.length == 0) {
            newArr = new int[1];
            newArr[0] = -1;
            return newArr;
        }
        return newArr;
    }
}

import java.util.Arrays;
import java.util.Stack;

public class DistinctNumber {
    // 숫자 배열에서 중복되는 숫자는 전부 제거하고 출력, 출력 순서는 배열 순서 그대로 유지
    public static void main(String[] args) {
        int[] testArr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = new DistinctNumber().distinct(testArr);
        System.out.println(Arrays.toString(result));

    }

    public int[] distinct(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stack.push(arr[0]);
            } else {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }

        }

        answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}

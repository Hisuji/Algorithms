public class Solution {
    public double solution(int[] arr) throws IllegalArgumentException{
        Solution solution = new Solution();
        double answer = 0;
        if (solution.checkLength(arr) && solution.checkRange(arr)) {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
            }
            answer = (double) temp / arr.length;
        }else {
            throw new IllegalArgumentException("제한사항에 위배됩니다.");
        }
        return answer;
    }

    public boolean checkLength(int[] arr) {
        boolean result = arr.length >= 1 && arr.length <= 100;
        return result;
    }

    public boolean checkRange(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= -10000 && arr[i] <= 10000)) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    // 출력 결과 확인
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4};
//        int[] arr = {};
        System.out.println(solution.solution(arr));
    }
}

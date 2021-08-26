import java.util.regex.Pattern;

public class TransitionSolution {
//    제한 조건
//    s의 길이는 1 이상 5이하입니다.
//    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
//    s는 부호와 숫자로만 이루어져있습니다.
//    s는 "0"으로 시작하지 않습니다.

    public boolean checkLength(String s) {
        if (s.length() >= 1 && s.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkRegEx(String s) {
        if (!Pattern.matches("[^0]", s) && Pattern.matches("^([\\+|\\-])?[0-9]*$", s)) {
            return true;
        } else {
            return false;
        }
    }

    public int solution(String s) {
        int result = 0;
        if (checkLength(s) == true && checkRegEx(s) == true) {
            result = Integer.parseInt(s);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new TransitionSolution().solution("-234");
        System.out.println(result);
    }
}

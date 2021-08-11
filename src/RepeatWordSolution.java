public class RepeatWordSolution {
    public String solution(int n) throws Exception{
        String answer = "";
        if (checkNumberLength(n)) {
            answer = writeWord(n);
        } else {
            throw new Exception();
        }

        return answer;
    }

    // 제한 조건 : n 길이는 10,000이하인 자연수
    public boolean checkNumberLength(int n) {
        if (n <= 10000) {
            return true;
        } else {
            return false;
        }
    }

    // 단어리턴
    public String writeWord(int n) {
        String word = "맛있는수박을먹자";
        String result = "";
        for (int i = 1; i <= n; i++) {
            // 변환 생각해보기...
        }

        return result;
    }
}

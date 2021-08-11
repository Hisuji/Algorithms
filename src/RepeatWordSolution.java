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
        Character[] word = {'수', '박'}; // 홀 - 짝
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result += word[1];
            } else {
                result += word[0];
            }
        }

        return result;
    }
}

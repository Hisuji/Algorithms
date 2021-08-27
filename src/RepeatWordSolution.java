public class RepeatWordSolution {
    public String solution(int n) throws Exception {
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
        return n <= 10000;
    }

    // 단어리턴
    public String writeWord(int n) {
        String word = "맛있는수박을먹자";
        String temp = "";
        String result = "";
        int outerLoopCount = (int) Math.ceil(n / (double) word.length());

        System.out.println(outerLoopCount);

        //몫
        for (int i = 0; i < outerLoopCount; i++) {
            for (int j = 0; j < word.length(); j++) {
                temp += word.charAt(j);
            }
        }
        result = temp.substring(0, n);

        return result;
    }
}

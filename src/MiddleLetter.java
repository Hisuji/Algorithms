public class MiddleLetter {
    public String solution(String s) {
        // substring(int startIndex, int endIndex)
        // startIndex 포함 & endIdnex 미포함
        // startIndex 주어진 s의 가운데
        // endIndex 홀수일 때는 1, 짝수일 때는 2
        // index 0 부터 시작
        // [0] [1] [2] [3] [4]
        // [0] [1] [2] [3]
        int startIndex = (s.length() - 1) / 2;

        return s.substring(startIndex, s.length() % 2 == 0 ? startIndex + 2 : startIndex  + 1);
    }
}

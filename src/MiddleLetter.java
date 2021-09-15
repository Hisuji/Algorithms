public class MiddleLetter {
    public String solution(String s) {
        String answer = "";
        // substring( x, y)
        // x == 가운데 글자
        // y == 홀/짝에 따라 가여올 글자의 수
        int wordLength = s.length();
        int standardNum = 2;
        int startIndex = (wordLength / standardNum);
        int endIndex = 0;
        if (wordLength % 2 == 0) {
            startIndex = startIndex - 1;
            endIndex = startIndex + 2;
        } else {
            endIndex = startIndex + 1;
        }

        answer = s.substring(startIndex, endIndex);
        return answer;
    }
}

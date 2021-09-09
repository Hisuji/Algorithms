public class LetterCase {
    public String solution(String s) {
        char[] word = s.toCharArray();
        String result = "";
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == ' ') {
                result += word[i];
                index = 0;
            } else {
                if (index % 2 == 0) { // 짝수 -> 대문자
                    result += Character.toUpperCase(word[i]);
                } else { // 홀수 -> 소문자
                    result += Character.toLowerCase(word[i]);
                }
                index++;
            }
        }
        return result;
    }
}

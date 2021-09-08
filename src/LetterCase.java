import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LetterCase {
    // TODO -  테스트 9번 실패함( 끝에 공백이 2번 들어간 케이스)
    // 처음, 마지막글자 공백인지 확인하기
    public List<String> checkBlank(String s) {
        List<String> result = new ArrayList<>();
        if (s.lastIndexOf(" ") == s.length() - 1) {
            result.add("last");
        } else if (s.indexOf(" ") == 0) {
            result.add("first");
        }
        return result;
    }

    // 공백 기준으로 문자 자르기
    public String[] splitWord(String s) {
        String[] word = s.split(" ");
        return word;
    }

    // 배열별로 홀수 = 소문자, 짝수 = 대문자
    public String divideLetterCase(String[] strArr) {
        String result = "";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (j % 2 == 0) {
                    result += String.valueOf(strArr[i].charAt(j)).toUpperCase();
                } else {
                    result += String.valueOf(strArr[i].charAt(j)).toLowerCase();
                }
            }
            result += " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String testWord = "try hello world ";
        LetterCase letterCase = new LetterCase();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(letterCase.divideLetterCase(letterCase.splitWord(testWord)));

        if (letterCase.checkBlank(testWord).contains("first") && letterCase.checkBlank(testWord).contains("last")) {
            stringBuffer.insert(0, " ");
            stringBuffer.insert(letterCase.divideLetterCase(letterCase.splitWord(testWord)).length(), " ");
        } else if (letterCase.checkBlank(testWord).contains("first")) {
            stringBuffer.insert(0, " ");
        } else if (letterCase.checkBlank(testWord).contains("last")) {
            stringBuffer.insert(letterCase.divideLetterCase(letterCase.splitWord(testWord)).length(), " ");
        }

        System.out.println(stringBuffer);
    }
}

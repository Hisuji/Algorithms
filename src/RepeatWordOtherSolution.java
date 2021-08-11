public class RepeatWordOtherSolution { // 다른사람 풀이 해석
    public static void main(String[] args) {
        System.out.println(new RepeatWordOtherSolution().replaceWord(10));
    }

    public String replaceWord(int n) {
        // new char[(n / 2) + 1]  나누기 몫 : 해당 값(크기)만큼 char 배열 생성
        // "\0 : 정규표현식 null
        return new String(new char[(n / 2) + 1]).replace("\0", "수박").substring(0, n);
    }
}

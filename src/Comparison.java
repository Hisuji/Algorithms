public class Comparison {
    boolean solution(String s) {
        boolean answer = true;

        if (s.toUpperCase().matches(".*(P|Y).*")) {
            int pCount = 0;
            int yCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.toUpperCase().charAt(i) == 'P') {
                    pCount += 1;
                } else if (s.toUpperCase().charAt(i) == 'Y') {
                    yCount += 1;
                }
            }

            if (pCount == yCount) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = true;
        }

        return answer;
    }
}

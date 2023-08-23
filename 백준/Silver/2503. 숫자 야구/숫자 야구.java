import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
     * Q. 1에서 9까지의 서로 다른 숫자 3개로 구성된 3자리 수
     * 같은 자리 같은 수면 스타라이크
     * 다른 자리 같은 수면 볼
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));

        int loop = Integer.parseInt(bf.readLine());
        int[] numbers = new int[loop];
        int[] strike = new int[loop];
        int[] ball = new int[loop];
        int result = 0;
        for (int i = 0; i < loop; i++) { // 숫자, 스트라이크, 볼 따로 저장 -> 계속 반복 필요
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
            strike[i] = Integer.parseInt(stringTokenizer.nextToken());
            ball[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int guess = 123; guess <= 987 ; guess++) {
            for (int index = 0; index < loop; index++) {
                int strikeCnt = 0;
                int ballCnt = 0;
                if ((guess % 1000 / 100 == guess % 100 / 10)
                        || (guess % 100 / 10 == guess % 10)
                            || (guess % 1000 / 100 == guess % 10)) { // 3자리 중 숫자가 같은 경우
                    break;
                }
                
                if (String.valueOf(guess).contains("0")) {
                    break;
                }
                
                if (String.valueOf(guess).contains(String.valueOf(numbers[index] % 1000 / 100))) { // 해당 숫자를 포함 하고 있으면
                    ballCnt++;
                    if(guess % 1000 / 100 == numbers[index] % 1000 / 100) {
                        ballCnt--; // 그 숫자가 같은 자리면
                        strikeCnt++;
                    }
                }

                if (String.valueOf(guess).contains(String.valueOf(numbers[index] % 100 / 10))) {
                    ballCnt++;
                    if(guess % 100 / 10 == numbers[index] % 100 / 10) {
                        ballCnt--;
                        strikeCnt++;
                    }
                }

                if (String.valueOf(guess).contains(String.valueOf(numbers[index] % 10))) {
                    ballCnt++;
                    if(guess % 10 == numbers[index] % 10) {
                        ballCnt--;
                        strikeCnt++;
                    }
                }

                if (strike[index] != strikeCnt || ball[index] != ballCnt) { // 1 ~ n 줄까지 스트라이크, 볼의 수가 맞지 않다면 다음 번호로
                    break;
                }

                if (index == loop -1) { // 1 ~ n 줄까지 조건을 모두 만족시켰다면
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

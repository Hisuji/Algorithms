import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // Q. 어떤 수 S -> 적절한 암호키인지 아닌기 구별
    // S -> 모든 소인수가 10의 6승보다 크다면 적절함 암호키
    // 소인수? 약수 중 소수인 약수
    // 약수? 나누었을 때 나머지가 0이 되는 수
    // 소수? 1보다 큰 자연수 중 1과 자기자신만 약수로 가지는 수


    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int line = Integer.parseInt(bf.readLine());
            for (int i = 0; i < line; i++) {
                long next = Long.parseLong(bf.readLine());
                for (int j = 2; j <= 1000000; j++) { // 모든 소인수가 10의 6승보다 크다면 적절함 암호키 -> 1000000 이하의 약수가 존재
                    if (next % j == 0) {
                        System.out.println("NO");
                        break;
                    }
                    if (j == 1000000) { // 모든 소인수가 10의 6승보다 크다면 적절함 암호키
                        System.out.println("YES");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

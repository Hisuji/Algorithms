import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Q. 3명(남규, 영훈, 택희)이 N개의 사탕 나누기
    // 조건 1) 남는 사탕은 없어야 한다.
    // 조건 2) 남규는 영훈보다 2개 이상 가져야 한다.
    // 조건 3) 3명 다 사탕을 가지고 있어야 한다.
    // 조건 4) 택희는 무조건 짝수로 가져야 한다.
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int candy = Integer.parseInt(bf.readLine());
            int count = 0;
            for (int i = 1; i <= candy; i++) {  // 조건 3
                for (int j = 1; j <= candy ; j++) { // 조건 3
                    for (int k = 1; k <= candy ; k++) { // 조건 3
                        if (i + j + k == candy) {   // 조건 1
                            if (i >= j + 2) {   // 조건 2
                                if (k % 2 == 0) {   // 조건 4
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

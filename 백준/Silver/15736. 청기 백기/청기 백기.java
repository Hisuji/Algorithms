import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    * 청기백기 뒤집기 게임
    * 첫 번째 줄 학생의 수이자 깃발의 수
    * Tip. 루트(제곱근)
    * */

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(bf.readLine());
            int result = (int) Math.floor(Math.sqrt(num));

            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

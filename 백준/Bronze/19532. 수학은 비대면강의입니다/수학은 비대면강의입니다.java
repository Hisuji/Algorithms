import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
    * Q. 연립방정식 풀이
    * ax + by = c
    * dx + ey = f
    * 값 a, b, c ,d ,e, f, x, y 모두 -999 이상 999 이하의 정수
    * */
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            int f = Integer.parseInt(stringTokenizer.nextToken());

            for (int i = -999; i <= 999; i++) {
                for (int j = -999; j <= 999; j++) {
                    if (a * i + b * j == c) {
                        if(d * i + e * j == f) {
                            System.out.printf("%d %d", i, j);
                        }
                    }
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

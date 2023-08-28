import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // Q. 체커(x, y) 좌표
    // 상하좌우 중 한 방향으로 1칸씩만 움직인다.
    /*
    * 예제 풀이
    * 만나는 지점(15, 14)
    *   - 15, 14 --> [0]
        - 15, 16 --> 2 + [0] = 2
        - 14, 15 --> 2 + [2] = 4
        - 16, 15 --> 2 + [4] = 6
    * 만나는 지점(15, 15)
        - 15, 14 --> [1]
        - 15, 16 --> 1 + [1] = 2
        - 14, 15 --> 1 + [2] = 3
        - 16, 15 --> 1 + [3] = 4
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));

        int checkerCnt = Integer.parseInt(bf.readLine());
        int[] checkerX = new int[checkerCnt];
        int[] checkerY = new int[checkerCnt];
        int[] result = new int[checkerCnt];
        Arrays.fill(result, -1); // result 전부 -1로 초기화
        for (int i = 0; i < checkerCnt; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            checkerX[i] = Integer.parseInt(stringTokenizer.nextToken());
            checkerY[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < checkerX.length; i++) {
            for (int j = 0; j < checkerY.length; j++) {
                List<Integer> distance = new ArrayList<>();

                for (int k = 0; k < checkerCnt; k++) {
                    distance.add(Math.abs(checkerX[k] - checkerX[i]) + Math.abs(checkerY[k] - checkerY[j]));
                    distance.sort(Comparator.naturalOrder());

                    int temp = 0;
                    for (int l = 0; l < distance.size(); l++) {
                        temp += distance.get(l);
                        if (result[l] == -1) {
                            result[l] = temp;
                        } else {
                            result[l] = Math.min(temp, result[l]);
                        }
                    }
                }

            }
        }

        for(int m = 0; m < result.length; m++){
            System.out.print(result[m] + " ");
        }
    }
}
// https://www.acmicpc.net/problem/2231
package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i <= N; i++) {
            int decomposition = i;
            int num = i;
            while (num != 0) {
                decomposition += num % 10;
                num = num / 10;
            }

            if (decomposition == N) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}

// https://www.acmicpc.net/problem/2292
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.print(1);
        } else {
            System.out.print(recursiveJumpRoom(N, 2, 7, 1));
        }
    }

    public static int recursiveJumpRoom(int N, int min, int max, int i) {
        if (min <= N && max >= N) {
            return i + 1;
        }

        min = min + 6 * i;
        max = max + 6 * (i + 1);
        return recursiveJumpRoom(N, min, max, ++i);
    }
}

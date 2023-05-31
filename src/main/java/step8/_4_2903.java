// https://www.acmicpc.net/problem/2903
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.printf("%d", recursiveCalculateSideDot(N, 2));

    }

    public static int recursiveCalculateSideDot(int N, int prevSideDot) {
        if (N == 0) {
            return prevSideDot * prevSideDot;
        }

        return recursiveCalculateSideDot(N - 1, prevSideDot * 2 - 1);
    }
}

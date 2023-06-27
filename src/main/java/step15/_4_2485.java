// https://www.acmicpc.net/problem/2485
package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int[] gaps = new int[N - 1];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
            if (i > 0) {
                gaps[i - 1] = trees[i] - trees[i - 1];
            }
        }

        int gcd = GCD(gaps[0], gaps[1]);
        for (int i = 2; i < gaps.length - 2; i++) {
            gcd = GCD(gcd, gaps[i]);
        }

        int total = 0;
        for (int gap : gaps) {
            total += gap / gcd - 1;
        }

        System.out.print(total);
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}

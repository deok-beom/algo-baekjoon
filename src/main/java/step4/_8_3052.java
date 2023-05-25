// https://www.acmicpc.net/problem/3052
package step4;

import java.io.*;
import java.util.Arrays;

public class _8_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remainders = new int[10];
        Arrays.fill(remainders, -1);

        for (int i = 0; i < 10; i++) {
            int remainder = Integer.parseInt(br.readLine()) % 42;
            if (contains(remainders, remainder)) {
                remainders[i] = remainder;
            }
        }

        int remainderCount = 0;
        for (int remainder : remainders) {
            if (remainder != -1) {
                ++remainderCount;
            }
        }

        System.out.print(remainderCount);
    }

    public static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return false;
            }
        }

        return true;
    }
}

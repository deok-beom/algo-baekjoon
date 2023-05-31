// https://www.acmicpc.net/problem/1193
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_1193 {
    public static int X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
        System.out.print(recursiveJumpRightUp(1, 1, 1));
    }

    public static String recursiveJumpLeftDown(int numerator, int denominator, int i) {
        if (i == X) {
            return String.format("%d/%d", numerator, denominator);
        }

        if (denominator == 1) {
            return recursiveJumpDown(++numerator, denominator, ++i);
        }

        return recursiveJumpLeftDown(++numerator, --denominator, ++i);
    }

    public static String recursiveJumpDown(int numerator, int denominator, int i) {
        if (i == X) {
            return String.format("%d/%d", numerator, denominator);
        }

        return recursiveJumpRightUp(--numerator, ++denominator, ++i);
    }

    public static String recursiveJumpRightUp(int numerator, int denominator, int i) {
        if (i == X) {
            return String.format("%d/%d", numerator, denominator);
        }

        if (numerator == 1) {
            return recursiveJumpRight(numerator, ++denominator, ++i);
        }

        return recursiveJumpRightUp(--numerator, ++denominator, ++i);
    }

    public static String recursiveJumpRight(int numerator, int denominator, int i) {
        if (i == X) {
            return String.format("%d/%d", numerator, denominator);
        }

        return recursiveJumpLeftDown(++numerator, --denominator, ++i);
    }
}

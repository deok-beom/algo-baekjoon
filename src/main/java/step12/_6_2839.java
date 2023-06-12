// https://www.acmicpc.net/problem/2839
package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sugar = -1;
        for (int i = N / 5; i >= 0; i--) {
            int num = N - i * 5;
            if (num == 0) {
                sugar = i;
                break;
            } else if (num % 3 == 0) {
                sugar = i + num / 3;
                break;
            }
        }

        System.out.print(sugar);
    }
}

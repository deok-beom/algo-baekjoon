// https://www.acmicpc.net/problem/2562
package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        int maxIndex = 1;
        for (int i = 2; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                maxIndex = i;
            }
        }

        System.out.printf("%d\n%d", max, maxIndex);
    }
}

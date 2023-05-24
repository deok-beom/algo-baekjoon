// https://www.acmicpc.net/problem/8393
package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= time; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}

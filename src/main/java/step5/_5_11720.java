// https://www.acmicpc.net/problem/11720
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strLength = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        for (int i = 0; i < strLength; i++) {
            sum += str.charAt(i) - 48;
        }
        System.out.print(sum);
    }
}

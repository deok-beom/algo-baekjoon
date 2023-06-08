// https://www.acmicpc.net/problem/24265
package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.printf("%d%s%d", (n * n - n) / 2, System.lineSeparator(), 2);
    }
}

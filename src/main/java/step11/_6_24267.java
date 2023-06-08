// https://www.acmicpc.net/problem/24267
package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.printf("%d%s%d", n * (n - 1) * (n - 2) / 6, System.lineSeparator(), 3);
    }
}

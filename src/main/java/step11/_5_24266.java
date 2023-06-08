// https://www.acmicpc.net/problem/24266
package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.printf("%d%s%d", n * n * n, System.lineSeparator(), 3);
    }
}

// https://www.acmicpc.net/problem/24264
package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.printf("%d%s%d", n * n, System.lineSeparator(), 2);
    }
}

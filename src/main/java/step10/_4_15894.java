// https://www.acmicpc.net/problem/15894
package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.printf("%d", n * 4);
    }
}

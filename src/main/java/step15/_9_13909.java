// https://www.acmicpc.net/problem/17103
package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((int) Math.floor(Math.sqrt(N)));
    }
}

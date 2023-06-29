// https://www.acmicpc.net/problem/4948
package step15;

import java.io.*;
import java.util.Arrays;

public class _7_4948 {
    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[123_456 * 2 + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
            bw.write(count + System.lineSeparator());
            n = Integer.parseInt(br.readLine());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

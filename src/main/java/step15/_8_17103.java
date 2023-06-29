// https://www.acmicpc.net/problem/17103
package step15;

import java.io.*;
import java.util.Arrays;

public class _8_17103 {
    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[1_000_001];

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
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            int count = 0;
            for (int j = 2; j <= num / 2; j++) {
                int anotherNum = num - j;

                if (isPrime[j] && isPrime[anotherNum]) {
                    count++;
                }
            }

            bw.write(count + System.lineSeparator());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

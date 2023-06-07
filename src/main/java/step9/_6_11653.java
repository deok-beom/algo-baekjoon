// https://www.acmicpc.net/problem/11653
package step9;

import java.io.*;

public class _6_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] primes = new int[N + 1];
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (primes[i] == 0) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = 1;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i < primes.length && N != 1; i++) {
            if (primes[i] != 0) {
                continue;
            }

            while ( N % i == 0 && N != 1) {
                N = N / i;
                bw.write(String.format("%d%s", i, System.lineSeparator()));
            }
        }

        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/4134
package step15;

import java.io.*;
import java.math.BigInteger;

public class _5_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            BigInteger number = BigInteger.valueOf(Long.parseLong(br.readLine()));
            if (number.isProbablePrime(10)) {
                bw.write(number + System.lineSeparator());
            } else {
                bw.write(number.nextProbablePrime() + System.lineSeparator());
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
// https://www.acmicpc.net/problem/2581
package step9;

import java.io.*;

public class _5_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            if (sum == 0) {
                min = isPrimeNum(i);
                sum = min;
            } else {
                sum += isPrimeNum(i);
            }
        }

        if (sum != 0) {
            System.out.printf("%d%s%d", sum, System.lineSeparator(), min);
        } else {
            System.out.print(-1);
        }
    }

    public static int isPrimeNum(int num) {
        if (num < 2) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }

        return num;
    }
}

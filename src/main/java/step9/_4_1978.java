// https://www.acmicpc.net/problem/1978
package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            count += isPrimeNum(Integer.parseInt(st.nextToken()));
        }

        System.out.print(count);
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

        return 1;
    }
}

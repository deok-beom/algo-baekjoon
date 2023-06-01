// https://www.acmicpc.net/problem/9506
package step9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _3_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sortAndInsert(i, factors);
                    if (i != n / i && n != n / i) sortAndInsert(n / i, factors);
                }
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(n);
            for (int i = 0; i < factors.size(); i++) {
                sum += factors.get(i);
                if (i == 0) {
                    sb.append(String.format(" = %d", factors.get(i)));
                } else {
                    sb.append(String.format(" + %d", factors.get(i)));
                }
            }

            if (n == sum) {
                bw.write(sb + System.lineSeparator());
            } else {
                bw.write(String.format("%d is NOT perfect.%s", n, System.lineSeparator()));
            }
        }

        bw.flush();
        bw.close();
    }

    public static void sortAndInsert(int factor, List<Integer> factors) {
        for (int i = 0; i < factors.size(); i++) {
            if (factors.get(i) > factor) {
                factors.add(i, factor);
                return;
            }
        }

        factors.add(factor);
    }
}

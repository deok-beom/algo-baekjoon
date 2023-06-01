// https://www.acmicpc.net/problem/2501
package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                sortAndInsert(i, factors);
                if ( i != N / i ) sortAndInsert(N / i, factors);
            }
        }

        if (factors.size() >= K) {
            System.out.print(factors.get(K - 1));
        } else {
            System.out.print(0);
        }
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

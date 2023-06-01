// https://www.acmicpc.net/problem/10757
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _8_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = A.length() - 1, j = B.length() - 1; i >= 0 || j >= 0; --i, --j) {
            if (i >= 0) {
                sum += A.charAt(i) - 48;
            }

            if (j >= 0) {
                sum += B.charAt(j) - 48;
            }

            sb.append(sum % 10);
            sum = (sum / 10 == 1) ? 1 : 0;
        }

        if (sum == 1) {
            sb.append(1);
        }
        System.out.print(sb.reverse());
    }
}

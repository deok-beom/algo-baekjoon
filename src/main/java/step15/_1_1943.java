// https://www.acmicpc.net/problem/1943
package step15;

import java.io.*;
import java.util.StringTokenizer;

public class _1_1943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int gcd = GCD(A, B);
            int lcm = (A * B) / gcd;
            bw.write(lcm + System.lineSeparator());
        }

        bw.flush();
        bw.close();
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }
}

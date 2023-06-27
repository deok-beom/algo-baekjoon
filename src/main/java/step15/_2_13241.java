// https://www.acmicpc.net/problem/13241
package step15;

import java.io.*;
import java.util.StringTokenizer;

public class _2_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long multiple = (long) A * B;

        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }

        long gcd = A;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(multiple / gcd));
        bw.flush();
        bw.close();
    }
}

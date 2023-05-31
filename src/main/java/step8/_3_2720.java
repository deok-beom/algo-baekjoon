// https://www.acmicpc.net/problem/2720
package step8;

import java.io.*;
import java.util.StringTokenizer;

public class _3_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int quarterCount, dimeCount, nickelCount;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());

            quarterCount = C / 25;
            C = C % 25;
            dimeCount = C / 10;
            C = C % 10;
            nickelCount = C / 5;
            C = C % 5;

            bw.write(String.format("%d %d %d %d%s", quarterCount, dimeCount, nickelCount, C, System.lineSeparator()));
        }
        bw.flush();
        bw.close();
    }
}

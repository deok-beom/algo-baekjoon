// https://www.acmicpc.net/problem/11022
package step3;

import java.io.*;
import java.util.StringTokenizer;

public class _8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < caseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.format("Case #%d: %d + %d = %d\n", i + 1, a, b, a + b));
        }
        bw.flush();
        bw.close();
    }
}

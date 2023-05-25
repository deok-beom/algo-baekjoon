// https://www.acmicpc.net/problem/10952
package step3;

import java.io.*;
import java.util.StringTokenizer;

public class _11_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            bw.write(String.format("%d%s", a + b, System.lineSeparator()));
        }
        bw.flush();
        bw.close();
    }
}

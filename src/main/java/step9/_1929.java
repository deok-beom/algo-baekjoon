// https://www.acmicpc.net/problem/1929
package step9;

import java.io.*;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] isComposite = new boolean[N + 1];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < isComposite.length; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = Math.max(2, M); i < isComposite.length; i++) {
            if (!isComposite[i]) {
                bw.write(String.format("%d%s", i, System.lineSeparator()));
            }
        }

        bw.flush();
        bw.close();
    }
}

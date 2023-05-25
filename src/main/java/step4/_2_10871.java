// https://www.acmicpc.net/problem/10871
package step4;

import java.io.*;
import java.util.StringTokenizer;

public class _2_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (X > num) {
                bw.write(String.format("%d ", num));
            }
        }

        bw.flush();
        bw.close();
    }
}

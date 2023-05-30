// https://www.acmicpc.net/problem/2738
package step7;

import java.io.*;
import java.util.StringTokenizer;

public class _2_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        int max = -1;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    x = i + 1;
                    y = j + 1;
                    max = num;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d%s", max, System.lineSeparator()));
        bw.write(String.format("%d %d", x, y));
        bw.flush();
        bw.close();
    }
}

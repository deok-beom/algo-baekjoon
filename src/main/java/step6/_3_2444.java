// https://www.acmicpc.net/problem/2444
package step6;

import java.io.*;

public class _3_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int blank = N;
        int star = -1;
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < N) {
                --blank;
                star += 2;
                for (int j = 0; j < blank; j++) {
                    bw.write(" ");
                }

                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
            } else {
                ++blank;
                star -= 2;
                for (int j = 0; j < blank; j++) {
                    bw.write(" ");
                }

                for (int j = 0; j < star; j++) {
                    bw.write("*");
                }
            }

            bw.write(System.lineSeparator());
        }

        bw.flush();
        bw.close();
    }
}

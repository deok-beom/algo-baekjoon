// https://www.acmicpc.net/problem/2439
package step3;

import java.io.*;

public class _10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.write(System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }
}

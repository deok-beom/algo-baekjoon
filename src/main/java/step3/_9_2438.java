// https://www.acmicpc.net/problem/2438
package step3;

import java.io.*;

public class _9_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            bw.write(System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }
}

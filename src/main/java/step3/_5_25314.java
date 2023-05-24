// https://www.acmicpc.net/problem/25314
package step3;

import java.io.*;

public class _5_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputByte = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < inputByte / 4; i++) {
            bw.write("long ");
        }

        bw.write("int");
        bw.flush();
        bw.close();
    }
}

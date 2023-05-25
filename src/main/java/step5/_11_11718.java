// https://www.acmicpc.net/problem/11718
package step5;

import java.io.*;

public class _11_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            bw.write(String.format("%s%s", input, System.lineSeparator()));
        }
        bw.flush();
        bw.close();
    }
}

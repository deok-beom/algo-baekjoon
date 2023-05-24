// https://www.acmicpc.net/problem/10926
package step1;

import java.io.*;

public class _7_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%s??!", id));
        bw.flush();
        bw.close();
    }
}

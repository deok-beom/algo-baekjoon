// https://www.acmicpc.net/problem/18108
package step1;

import java.io.*;

public class _8_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int BEYear = Integer.parseInt(br.readLine());
        int ACYear = BEYear - 543;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", ACYear));
        bw.flush();
        bw.close();
    }
}

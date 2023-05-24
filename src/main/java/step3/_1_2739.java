// https://www.acmicpc.net/problem/2739
package step3;

import java.io.*;

public class _1_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int leftOperand = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= 9; i++) {
            bw.write(String.format("%d * %d = %d\n", leftOperand, i, leftOperand * i));
        }
        bw.flush();
        bw.close();
    }
}

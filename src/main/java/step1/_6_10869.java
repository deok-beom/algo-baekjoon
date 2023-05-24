// https://www.acmicpc.net/problem/10869
package step1;

import java.io.*;
import java.util.StringTokenizer;

public class _6_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.format("%d\n", a + b));
        bw.write(String.format("%d\n", a - b));
        bw.write(String.format("%d\n", a * b));
        bw.write(String.format("%d\n", a / b));
        bw.write(String.format("%d", a % b));
        bw.flush();
        bw.close();
    }
}

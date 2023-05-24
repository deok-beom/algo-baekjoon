// https://www.acmicpc.net/problem/10430
package step1;

import java.io.*;
import java.util.StringTokenizer;

public class _9_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d\n", (a + b) % c));
        bw.write(String.format("%d\n", ((a % c) + (b % c)) % c));
        bw.write(String.format("%d\n", (a * b) % c));
        bw.write(String.format("%d", ((a % c) * (b % c)) % c));
        bw.flush();
        bw.close();

    }
}

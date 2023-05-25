// https://www.acmicpc.net/problem/9086
package step5;

import java.io.*;

public class _3_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < caseCount; i++) {
            String str = br.readLine();
            bw.write(String.format("%s%s%s", str.charAt(0), str.charAt(str.length() - 1), System.lineSeparator()));
        }
        bw.flush();
        bw.close();
    }
}

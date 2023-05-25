// https://www.acmicpc.net/problem/2675
package step5;

import java.io.*;
import java.util.StringTokenizer;

public class _7_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < caseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeatCount = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            bw.write(String.format("%s%s", makeRepeatedStr(str, repeatCount), System.lineSeparator()));
        }

        bw.flush();
        bw.close();
    }

    public static String makeRepeatedStr(String str, int repeatCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(String.valueOf(str.charAt(i)).repeat(repeatCount));
        }

        return sb.toString();
    }
}

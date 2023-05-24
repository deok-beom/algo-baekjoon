// https://www.acmicpc.net/problem/10950
package step3;

import java.io.*;
import java.util.StringTokenizer;

public class _2_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseVolume = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < caseVolume; i++) {
            String singleCase = br.readLine();
            StringTokenizer st = new StringTokenizer(singleCase);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.format("%d\n", a + b));
        }

        bw.flush();
        bw.close();
    }
}

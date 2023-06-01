// https://www.acmicpc.net/problem/5086
package step9;

import java.io.*;
import java.util.StringTokenizer;

public class _1_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            if (firstNum == 0 && secondNum == 0) {
                break;
            }

            if ((secondNum % firstNum) == 0) {
                bw.write(String.format("factor%s", System.lineSeparator()));
            } else if ((firstNum % secondNum) == 0) {
                bw.write(String.format("multiple%s", System.lineSeparator()));
            } else {
                bw.write(String.format("neither%s", System.lineSeparator()));
            }
        }

        bw.flush();
        bw.close();
    }
}

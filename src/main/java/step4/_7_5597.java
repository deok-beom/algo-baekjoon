// https://www.acmicpc.net/problem/5597
package step4;

import java.io.*;

public class _7_5597 {
    public static void main(String[] args) throws IOException {
        int[] attendanceArray = new int[30];
        for (int i = 0; i < attendanceArray.length; i++) {
            attendanceArray[i] = i + 1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 28; i++) {
            int attendance = Integer.parseInt(br.readLine());
            attendanceArray[attendance - 1] = 0;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : attendanceArray) {
            if (i != 0) {
                bw.write(String.format("%d%s", i, System.lineSeparator()));
            }
        }
        bw.flush();
        bw.close();
    }
}

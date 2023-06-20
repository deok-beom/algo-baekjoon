// https://www.acmicpc.net/problem/11651
package step13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _8_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < coordinates.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(coordinates, (c1, c2) -> {
            if (c1[1] == c2[1]) {
                return c1[0] - c2[0];
            } else {
                return c1[1] - c2[1];
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int[] coordinate : coordinates) {
            bw.write(coordinate[0] + " " + coordinate[1] + System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }
}

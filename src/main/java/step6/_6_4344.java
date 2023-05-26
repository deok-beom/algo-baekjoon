// https://www.acmicpc.net/problem/4344
package step6;

import java.io.*;
import java.util.StringTokenizer;

public class _6_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            int scoreSum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                scoreSum += scores[j];
            }

            int averageScore = scoreSum / N;
            int aboveAverageCount = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > averageScore) {
                    aboveAverageCount++;
                }
            }

            double aboveAverageRatio = (double) aboveAverageCount / N * 100;
            bw.write(String.format("%.3f%%%s", aboveAverageRatio, System.lineSeparator()));
        }

        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/1085
package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] distances = new int[4];
        distances[0] = x;
        distances[1] = y;
        distances[2] = w - x;
        distances[3] = h - y;

        int min = distances[0];
        for (int i = 1; i < distances.length; i++) {
            if (min > distances[i]) {
                min = distances[i];
            }
        }

        System.out.printf("%d", min);
    }
}

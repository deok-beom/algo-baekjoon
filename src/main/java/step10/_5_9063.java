// https://www.acmicpc.net/problem/9063
package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int minX = Integer.parseInt(st.nextToken());
        int maxX = minX;
        int minY = Integer.parseInt(st.nextToken());
        int maxY = minY;

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (minX > x) {
                minX = x;
            } else if (maxX < x) {
                maxX = x;
            }

            if (minY > y) {
                minY = y;
            } else if (maxY < y) {
                maxY = y;
            }
        }

        long width = maxX - minX;
        long height = maxY - minY;
        System.out.printf("%d", width * height);
    }
}

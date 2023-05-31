// https://www.acmicpc.net/problem/2563
package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_2563 {
    public static void main(String[] args) throws IOException {
        int[][] canvas = new int[101][];
        for (int i = 0; i < canvas.length; i++) {
            canvas[i] = new int[101];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paperNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < paperNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int bottom = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    canvas[left + j][bottom + k] = 1;
                }
            }
        }

        int size = 0;
        for (int[] row : canvas) {
            for (int dot : row) {
                if (dot == 1) {
                    size++;
                }
            }
        }

        System.out.print(size);
    }
}

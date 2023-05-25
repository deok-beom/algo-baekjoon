// https://www.acmicpc.net/problem/10811
package step4;

import java.io.*;
import java.util.StringTokenizer;

public class _9_10811 {
    public static void main(String[] ags) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] baskets = new int[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }

        int iterationCount = Integer.parseInt(st.nextToken());
        for (int x = 0; x < iterationCount; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            invert(baskets, i, j);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int basket : baskets) {
            bw.write(String.format("%d ", basket));
        }
        bw.flush();
        bw.close();
    }

    public static void invert(int[] array, int start, int end) {
        --start;
        --end;
        for (int i = 0; i <= (end - start) / 2; i++) {
            int temp = array[start + i];
            array[start + i] = array[end - i];
            array[end - i] = temp;
        }
    }
}

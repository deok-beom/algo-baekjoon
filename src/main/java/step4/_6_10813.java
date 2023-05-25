// https://www.acmicpc.net/problem/10813
package step4;

import java.io.*;
import java.util.StringTokenizer;

public class _6_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] baskets = new int[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }
        int iterationCount = Integer.parseInt(st.nextToken());

        for (int x = 0; x < iterationCount; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int basket : baskets) {
            bw.write(String.format("%d ", basket));
        }
        bw.flush();
        bw.close();
    }
}

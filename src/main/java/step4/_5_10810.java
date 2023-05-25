package step4;

import java.io.*;
import java.util.StringTokenizer;

public class _5_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int iterationCount = Integer.parseInt(st.nextToken());

        for (int x = 0; x < iterationCount; x++) {

            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int k = Integer.parseInt(st.nextToken());

            for (int y = i; y <= j; y++) {
                basket[y] = k;
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int j : basket) {
            bw.write(String.format("%d ", j));
        }
        bw.flush();
        bw.close();
    }
}

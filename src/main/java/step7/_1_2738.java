// https://www.acmicpc.net/problem/2738
package step7;

import java.io.*;
import java.util.StringTokenizer;

public class _1_2738 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] matrixA = makeMatrix(N, M);
        int[][] matrixB = makeMatrix(N, M);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(String.format("%d ", matrixA[i][j] + matrixB[i][j]));
            }
            bw.write(System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }

    public static int[][] makeMatrix(int rows, int columns) throws IOException {
        int[][] outerArray = new int[rows][];
        for (int i = 0; i < outerArray.length; i++) {
            int[] innerArray = new int[columns];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < innerArray.length; j++) {
                innerArray[j] = Integer.parseInt(st.nextToken());
            }
            outerArray[i] = innerArray;
        }

        return outerArray;
    }
}

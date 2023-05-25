// https://www.acmicpc.net/problem/3003
package step6;

import java.io.*;
import java.util.StringTokenizer;

public class _2_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int king = 1 - Integer.parseInt(st.nextToken());
        int queen = 1 -Integer.parseInt(st.nextToken());
        int rook = 2 - Integer.parseInt(st.nextToken());
        int bishop = 2 - Integer.parseInt(st.nextToken());
        int knight = 2 - Integer.parseInt(st.nextToken());
        int pawn = 8 - Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d %d %d %d %d %d", king, queen, rook, bishop, knight, pawn));
        bw.flush();
        bw.close();
    }
}

// https://www.acmicpc.net/problem/1018
package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_1018 {
    public static char[][] blackBoard = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };

    public static char[][] whiteBoard = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][];
        for (int i = 0; i < board.length; i++) {
            char[] row = new char[M];
            String inputRow = br.readLine();
            for (int j = 0; j < M; j++) {
                row[j] = inputRow.charAt(j);
            }

            board[i] = row;
        }

        int min = 64;
        for (int i = 0; i + 7 < N; i++) {
            for (int j = 0; j + 7 < M; j++) {
                int count = countToChangeColor(board, i, j);
                if (min > count) {
                    min = count;
                }
            }
        }

        System.out.print(min);
    }

    public static int countToChangeColor(char[][] board, int startRow, int startCol) {
        int countIfWhite = 0;
        int countIfBlack = 0;

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (board[i][j] != whiteBoard[i - startRow][j - startCol]) {
                    countIfWhite++;
                }

                if (board[i][j] != blackBoard[i - startRow][j - startCol]) {
                    countIfBlack++;
                }
            }
        }

        return Math.min(countIfBlack, countIfWhite);
    }
}

// https://www.acmicpc.net/problem/10798
package step7;

import java.io.*;

public class _3_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] wordGrid = new char[5][];
        int maxWordLength = 0;
        for (int i = 0; i < wordGrid.length; i++) {
            String word = br.readLine();
            if (maxWordLength < word.length()) {
                maxWordLength = word.length();
            }

            wordGrid[i] = word.toCharArray();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < maxWordLength; i++) {
            for (int j = 0; j < 5; j++) {
                if(wordGrid[j].length > i) {
                    bw.write(wordGrid[j][i]);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

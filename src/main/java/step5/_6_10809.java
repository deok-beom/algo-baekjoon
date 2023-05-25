// https://www.acmicpc.net/problem/10809
package step5;

import java.io.*;
import java.util.Arrays;

public class _6_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] firstAlphabetPositions = new int[26];
        Arrays.fill(firstAlphabetPositions, -1);

        for (int i = 0; i < str.length(); i++) {
            int alphabetIndex = str.charAt(i) - 97;
            if (firstAlphabetPositions[alphabetIndex] == -1) {
                firstAlphabetPositions[alphabetIndex] = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int firstAlphabetPosition : firstAlphabetPositions) {
            bw.write(String.format("%d ", firstAlphabetPosition));
        }
        bw.flush();
        bw.close();
    }
}

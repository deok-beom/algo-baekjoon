// https://www.acmicpc.net/problem/1157
package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] letterUsages = new int[26];
        int maxUsage = 0;
        char mostUsedLetter = '?';
        for (int i = 0; i < str.length(); i++) {
            int letterUsage = ++letterUsages[str.charAt(i) - 65];
            if (maxUsage < letterUsage) {
                maxUsage = letterUsage;
                mostUsedLetter = str.charAt(i);
            }
        }

        for (int i = 0; i < letterUsages.length; i++) {
            if (maxUsage == letterUsages[i] && mostUsedLetter != i + 65) {
                mostUsedLetter = '?';
                break;
            }
        }

        System.out.print(mostUsedLetter);
    }
}

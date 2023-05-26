// https://www.acmicpc.net/problem/2941
package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7_2941 {
    public static String[] croatianLetters = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phrase = br.readLine();
        int count = 0;

        for (String croatianLetter : croatianLetters) {
            int lastIndex = 0;
            while (lastIndex != -1) {
                lastIndex = phrase.indexOf(croatianLetter, lastIndex);
                if (lastIndex != -1) {
                    count++;
                    lastIndex += croatianLetter.length();
                }
            }

            phrase = phrase.replaceAll(croatianLetter, ".");
        }

        phrase = phrase.replaceAll("\\.", "");
        count = count + phrase.length();
        System.out.print(count);
    }
}

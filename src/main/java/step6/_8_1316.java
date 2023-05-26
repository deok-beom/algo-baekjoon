// https://www.acmicpc.net/problem/1316
package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _8_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            Set<Character> encounterLetterSet = new HashSet<>();
            if (isGroupWord(br.readLine(), encounterLetterSet)) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean isGroupWord(String str, Set<Character> encounterLetterSet) {
        char pointer = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (pointer != str.charAt(i)) {
                if (encounterLetterSet.contains(str.charAt(i))) {
                    return false;
                } else {
                    encounterLetterSet.add(pointer);
                    pointer = str.charAt(i);
                }
            }
        }

        return true;
    }
}

// https://www.acmicpc.net/problem/1181
package step13;

import java.io.*;
import java.util.Arrays;

public class _9_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (w1, w2) -> {
            if (w1.length() == w2.length()) {
                int ret = 0;
                for (int k = 0; k < w1.length(); k++) {
                    if (w1.charAt(k) != w2.charAt(k)) {
                        ret = w1.charAt(k) - w2.charAt(k);
                        break;
                    }
                }
                return ret;
            } else {
                return w1.length() - w2.length();
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String prevWord = "";
        for (String word : words) {
            if (!prevWord.equals(word)) {
                prevWord = word;
                bw.write(word + System.lineSeparator());
            }
        }
        bw.flush();
        bw.close();
    }
}

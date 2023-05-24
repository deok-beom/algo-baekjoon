// https://www.acmicpc.net/problem/11382

package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        long sum = 0;
        int count = st.countTokens();
        for (int i = 0; i < count; i++) {
            sum += Long.parseLong(st.nextToken());
        }

        System.out.println(sum);
    }
}

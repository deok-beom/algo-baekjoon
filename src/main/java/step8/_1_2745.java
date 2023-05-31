// https://www.acmicpc.net/problem/2745
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            int num = translateCharToNum(N.charAt(N.length() - 1 - i));
            sum = sum + num * (int) Math.pow(B, i);
        }

        System.out.printf("%d", sum);
    }

    public static int translateCharToNum(char num) {
        if (num >= 65 && num <= 90) {
            return num - 55;
        } else {
            return num - 48;
        }
    }
}

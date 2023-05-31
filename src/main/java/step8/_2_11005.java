// https://www.acmicpc.net/problem/11005
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            int remain = N % B;
            sb.insert(0, translateNumToChar(remain));
            N = N / B;
        }

        System.out.printf("%s", sb);
    }

    public static char translateNumToChar(int num) {
        if (num >= 10) {
            return (char) (num + 55);
        } else {
            return (char) (num + 48);
        }
    }
}

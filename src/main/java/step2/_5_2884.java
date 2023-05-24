// https://www.acmicpc.net/problem/2884
package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        minute -= 45;

        if (minute < 0) {
            minute += 60;
            hour = (hour - 1 < 0) ? hour + 23 : hour - 1;
        }

        System.out.printf("%d %d", hour, minute);
    }
}

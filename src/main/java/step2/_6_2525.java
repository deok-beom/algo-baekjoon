// https://www.acmicpc.net/problem/2525
package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _6_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        minute = minute + time;
        hour += (minute / 60);
        minute = minute % 60;
        hour = (hour % 24);

        System.out.printf("%d %d", hour, minute);

    }
}

// https://www.acmicpc.net/problem/2480
package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dice = new int[3];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        int number = dice[0];
        int sameCount = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] == dice[j]) {
                    number = dice[i];
                    sameCount++;
                    break;
                } else if (sameCount == 0 && number < dice[j]) {
                    number = dice[j];
                }
            }
        }

        switch (sameCount) {
            case 0:
                System.out.println(number * 100);
                break;
            case 1:
                System.out.println(1000 + number * 100);
                break;
            case 2:
                System.out.println(10000 + number * 1000);
                break;
        }

    }
}

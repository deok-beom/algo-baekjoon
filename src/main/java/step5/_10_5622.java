// https://www.acmicpc.net/problem/5622
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int time = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) <= 67) {
                time += 3;
            } else if (number.charAt(i) <= 70) {
                time += 4;
            } else if (number.charAt(i) <= 73) {
                time += 5;
            } else if (number.charAt(i) <= 76) {
                time += 6;
            } else if (number.charAt(i) <= 79) {
                time += 7;
            } else if (number.charAt(i) <= 83) {
                time += 8;
            } else if (number.charAt(i) <= 86) {
                time += 9;
            } else if (number.charAt(i) <= 90) {
                time += 10;
            }
        }

        System.out.print(time);
    }
}

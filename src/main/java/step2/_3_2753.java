// https://www.acmicpc.net/problem/2753
package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

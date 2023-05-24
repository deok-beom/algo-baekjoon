// https://www.acmicpc.net/problem/1008
package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1008 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;

        try {
            String input = br.readLine();
            int a = input.charAt(0) - 48;
            int b = input.charAt(input.length() - 1) - 48;
            result = (double) a / b;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
// https://www.acmicpc.net/problem/2908
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String leftNum = st.nextToken();
        String rightNum = st.nextToken();

        for (int i = 2; i >= 0; --i) {
            int leftDigit = leftNum.charAt(i);
            int rightDigit = rightNum.charAt(i);
            if (leftDigit > rightDigit) {
                System.out.print(reverseString(leftNum));
                break;
            } else if (leftDigit < rightDigit) {
                System.out.print(reverseString(rightNum));
                break;
            }
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

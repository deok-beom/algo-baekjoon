// https://www.acmicpc.net/problem/27866
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(str.charAt(Integer.parseInt(br.readLine()) - 1));
    }
}

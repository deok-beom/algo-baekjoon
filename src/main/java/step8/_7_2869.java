// https://www.acmicpc.net/problem/2869
package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7_2869 {
    public static int A, B, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        int daySpeed = A - B;
        if ( (V - A) % daySpeed != 0) {
            System.out.print(2 + (V - A) / (A - B));
        } else {
            System.out.print(1 + (V - A) / (A - B));
        }
    }
}

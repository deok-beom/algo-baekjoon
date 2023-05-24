// https://www.acmicpc.net/problem/2588
package step1;

import java.io.*;

public class _10_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] midValue = new int[3];
        int sum = 0;
        for (int i = 0; i < midValue.length; i++) {
            midValue[i] = one * (two % 10);
            two = two / 10;
            bw.write(String.format("%d\n", midValue[i]));
            sum += midValue[i] * pow(10, i);
        }

        bw.write(String.format("%d", sum));
        bw.flush();
        bw.close();
    }

    public static int pow(int a, int b) {
        int result = 1;
        if (b != 0) {
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
        }

        return result;
    }
}

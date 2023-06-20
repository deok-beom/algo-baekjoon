// https://www.acmicpc.net/problem/2750
package step13;

import java.io.*;

public class _1_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < length; i++) {
            bw.write(String.format("%d%s", nums[i], System.lineSeparator()));
        }
        bw.flush();
        bw.close();
    }
}

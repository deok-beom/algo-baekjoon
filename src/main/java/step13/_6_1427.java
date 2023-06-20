// https://www.acmicpc.net/problem/1427
package step13;

import java.io.*;

public class _6_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] nums = new int[10];
        for (int i = 0; i < N.length(); i++) {
            int index = Integer.parseInt(N.substring(i, i + 1));
            nums[index]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = nums.length - 1; i >= 0; --i) {
            for (int j = 0; j < nums[i]; j++) {
                bw.write(String.valueOf(i));
            }
        }
        bw.flush();
        bw.close();
    }
}

package step13;

import java.io.*;

public class _5_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[10_001];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            ++nums[num];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                bw.write(i + System.lineSeparator());
            }
        }
        bw.flush();
        bw.close();
    }
}

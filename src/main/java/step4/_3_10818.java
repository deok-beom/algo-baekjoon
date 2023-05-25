// https://www.acmicpc.net/problem/10818
package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        nums[0] = Integer.parseInt(st.nextToken());
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            if (min > nums[i]) {
                min = nums[i];
            } else if (max < nums[i]) {
                max = nums[i];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}

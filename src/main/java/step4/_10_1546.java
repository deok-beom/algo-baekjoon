// https://www.acmicpc.net/problem/1546
package step4;

import java.io.*;
import java.util.StringTokenizer;

public class _10_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] subjects = new int[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = Integer.parseInt(st.nextToken());
            if (max < subjects[i]) {
                max = subjects[i];
            }
        }

        double sum = 0;
        for (int subject : subjects) {
            sum += (double) subject / max * 100;
        }

        System.out.print(sum / subjects.length);

    }
}

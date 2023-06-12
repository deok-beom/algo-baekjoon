// https://www.acmicpc.net/problem/1436
package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int seriesOrder = 1;
        int seriesNum = 666;
        while (seriesOrder < N) {
            seriesNum++;
            if(validateSeriesNum(seriesNum)) {
                seriesOrder++;
            }
        }

        System.out.print(seriesNum);
    }

    public static boolean validateSeriesNum(int seriesNum) {
        int flag = 0;
        while (seriesNum != 0 && flag != 3) {
            int num = seriesNum % 10;
            if (num != 6) {
                flag = 0;
            } else {
                flag++;
            }
            seriesNum = seriesNum / 10;
        }

        return flag == 3;
    }
}

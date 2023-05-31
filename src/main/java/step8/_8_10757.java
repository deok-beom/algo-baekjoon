package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _8_10757 {
    public static int[] arrayA, arrayB;
    public static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        String longerNum;
        String shorterNum;
        if (A.length() > B.length()) {
            longerNum = A;
            shorterNum = B;
            length = A.length();
        } else {
            longerNum = B;
            shorterNum = A;
            length = B.length();
        }

        arrayA = new int[length];
        arrayB = new int[length];

        for (int i = 0; i < length; i++) {
            arrayA[i] = longerNum.charAt(length - 1 - i) - 48;
        }

        for (int i = 0; i < shorterNum.length(); i++) {
            arrayB[i] = shorterNum.charAt(shorterNum.length() - 1 - i) - 48;
        }

        for (int i = shorterNum.length(); i < length; i++) {
            arrayB[i] = 0;
        }

        System.out.print(recursiveBigNumberPlus(new int[length], 0, false));
    }

    public static String recursiveBigNumberPlus(int[] sumArray, int i, boolean hasCarryOver) {
        if (i == length) {
            StringBuilder sb = new StringBuilder();
            for (int num : sumArray) {
                sb.insert(0, num);
            }

            if (hasCarryOver) {
                sb.insert(0, 1);
            }

            return sb.toString();
        }

        int sum = arrayA[i] + arrayB[i];
        if (hasCarryOver) {
            sum++;
        }

        hasCarryOver = sum / 10 == 1;
        sumArray[i] = sum % 10;

        return recursiveBigNumberPlus(sumArray, ++i, hasCarryOver);
    }
}

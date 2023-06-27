// https://www.acmicpc.net/problem/1735
package step15;

import java.io.*;
import java.util.StringTokenizer;

public class _3_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numeratorA = Integer.parseInt(st.nextToken());
        int denominatorA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int numeratorB = Integer.parseInt(st.nextToken());
        int denominatorB = Integer.parseInt(st.nextToken());

        int denominatorLCM = lcm(denominatorA, denominatorB);
        numeratorA = denominatorLCM / denominatorA * numeratorA;
        numeratorB = denominatorLCM / denominatorB * numeratorB;
        int numeratorSum = numeratorA + numeratorB;

        int gcd = gcd(numeratorSum, denominatorLCM);

        int numerator = numeratorSum / gcd;
        int denominator = denominatorLCM / gcd;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(numerator + " " + denominator);
        bw.flush();

        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return a * b / gcd;
    }
}

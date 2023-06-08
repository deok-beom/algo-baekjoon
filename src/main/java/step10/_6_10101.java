// https://www.acmicpc.net/problem/10101
package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _6_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> angles = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int angle = Integer.parseInt(br.readLine());
            angles.add(angle);
            sum += angle;
        }

        if (sum != 180) {
            System.out.print("Error");
        } else {
            switch (angles.size()) {
                case 3:
                    System.out.print("Scalene");
                    break;
                case 2:
                    System.out.print("Isosceles");
                    break;
                case 1:
                    System.out.print("Equilateral");
                    break;
            }
        }
    }
}

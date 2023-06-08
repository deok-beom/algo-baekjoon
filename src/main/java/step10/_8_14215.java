// https://www.acmicpc.net/problem/14215
package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _8_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> sides = new HashMap<>();
        int longest = 0;

        for (int i = 0; i < 3; i++) {
            int side = Integer.parseInt(st.nextToken());
            if (sides.containsKey(side)) {
                sides.put(side, sides.get(side) + 1);
            } else {
                sides.put(side, 1);
            }

            if (longest < side) {
                longest = side;
            }
        }

        if (sides.size() == 1) {
            System.out.print(longest * 3);
        } else if (validateTriangle(sides, longest)) {
            int sum = 0;
            for (Map.Entry<Integer, Integer> entry : sides.entrySet()) {
                sum += entry.getKey() * entry.getValue();
            }
            System.out.print(sum);
        } else {
            int sum = 0;
            for (Map.Entry<Integer, Integer> entry : sides.entrySet()) {
                if (entry.getKey() != longest) {
                    sum += entry.getKey() * entry.getValue();
                }
            }
            System.out.print(sum + sum - 1);
        }

    }

    public static boolean validateTriangle(Map<Integer, Integer> sides, int longest) {
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : sides.entrySet()) {
            if (entry.getKey() != longest) {
                sum += entry.getKey() * entry.getValue();
            } else {
                sum += entry.getKey() * (entry.getValue() - 1);
            }
        }

        return sum > longest;
    }
}

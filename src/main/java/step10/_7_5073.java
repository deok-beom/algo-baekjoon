// https://www.acmicpc.net/problem/5073
package step10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _7_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            Map<Integer, Integer> sides = new HashMap<>();
            int longest = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
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

            if (longest == 0) {
                break;
            }

            if (sides.size() == 1) {
                bw.write(String.format("Equilateral%s", System.lineSeparator()));
            } else if (validateTriangle(sides, longest)) {
                if (sides.size() == 2) {
                    bw.write(String.format("Isosceles%s", System.lineSeparator()));
                } else {
                    bw.write(String.format("Scalene%s", System.lineSeparator()));
                }
            } else {
                bw.write(String.format("Invalid%s", System.lineSeparator()));
            }
        }

        bw.flush();
        bw.close();
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

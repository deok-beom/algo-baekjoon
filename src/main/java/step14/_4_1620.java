// https://www.acmicpc.net/problem/1620
package step14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _4_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> numberByMonster = new HashMap<>();
        Map<Integer, String> monsterByNumber = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String monster = br.readLine();
            numberByMonster.put(monster, i);
            monsterByNumber.put(i, monster);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (input.matches("[0-9]+")) {
                bw.write(monsterByNumber.get(Integer.parseInt(input)) + System.lineSeparator());
            } else {
                bw.write(numberByMonster.get(input) + System.lineSeparator());
            }
        }
        bw.flush();
        bw.close();
    }
}

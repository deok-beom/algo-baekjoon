// https://www.acmicpc.net/problem/10816
package step14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _5_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> hands = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            if (hands.containsKey(card)) {
                hands.put(card, hands.get(card) + 1);
            } else {
                hands.put(card, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            bw.write(hands.getOrDefault(card, 0) + " ");
        }

        bw.flush();
        bw.close();
    }
}

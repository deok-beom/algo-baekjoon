// https://www.acmicpc.net/problem/1764
package step14;

import java.io.*;
import java.util.*;

public class _6_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> unheardPeople = new HashSet<>();

        for (int i = 0; i < N; i++) {
            unheardPeople.add(br.readLine());
        }

        List<String> unknownPeople = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String unseenPerson = br.readLine();
            if(unheardPeople.contains(unseenPerson)) {
                unknownPeople.add(unseenPerson);
            }
        }
        unknownPeople.sort(Comparator.naturalOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(unknownPeople.size() + System.lineSeparator());
        for (String unknownPerson : unknownPeople) {
            bw.write(unknownPerson + System.lineSeparator());
        }

        bw.flush();
        bw.close();
    }
}

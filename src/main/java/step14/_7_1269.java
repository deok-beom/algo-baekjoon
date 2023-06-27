// https://www.acmicpc.net/problem/1269
package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _7_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Set<Integer> A = new HashSet<>();
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        count += subtract(A, B);
        count += subtract(B, A);
        System.out.print(count);
    }

    public static int subtract(Set<Integer> A, Set<Integer> B) {
        int count = 0;
        for (Integer element : A) {
            if (!B.contains(element)) {
                count++;
            }
        }

        return count;
    }
}

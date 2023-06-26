// https://www.acmicpc.net/problem/7785
package step14;

import java.io.*;
import java.util.*;

public class _3_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> workerSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String worker = st.nextToken();
            String behavior = st.nextToken();

            if (behavior.equals("enter")) {
                workerSet.add(worker);
            } else {
                workerSet.remove(worker);
            }
        }

        String[] arrays = workerSet.toArray(new String[0]);
        Arrays.sort(arrays, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String array : arrays) {
            bw.write(array + System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }
}

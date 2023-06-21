// https://www.acmicpc.net/problem/10814
package step13;

import java.io.*;
import java.util.StringTokenizer;

public class _10_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ages = new int[N];
        String[] names = new String[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ages[i] = Integer.parseInt(st.nextToken());
            names[i] = st.nextToken();
        }

        sort(ages, names);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < ages.length; i++) {
            bw.write(ages[i] + " " + names[i] + System.lineSeparator());
        }
        bw.flush();
        bw.close();
    }

    public static void sort(int[] ageArr, String[] nameArr) {
        if (ageArr.length <= 1) {
            return;
        }

        int mid = ageArr.length / 2;
        int[] leftAges = new int[mid];
        String[] leftNames = new String[mid];
        int[] rightAges = new int[ageArr.length - mid];
        String[] rightNames = new String[nameArr.length - mid];

        System.arraycopy(ageArr, 0, leftAges, 0, mid);
        System.arraycopy(nameArr, 0, leftNames, 0, mid);
        System.arraycopy(ageArr, mid, rightAges, 0, ageArr.length - mid);
        System.arraycopy(nameArr, mid, rightNames, 0, nameArr.length - mid);

        sort(leftAges, leftNames);
        sort(rightAges, rightNames);

        merge(leftAges, leftNames, rightAges, rightNames, ageArr, nameArr);
    }

    private static void merge(int[] leftAges, String[] leftNames, int[] rightAges,
                              String[] rightNames, int[] ageArr, String[] nameArr) {

        int i = 0, j = 0, k = 0;
        while (i < leftAges.length && j < rightAges.length) {
            if (leftAges[i] <= rightAges[j]) {
                ageArr[k] = leftAges[i];
                nameArr[k++] = leftNames[i++];
            } else {
                ageArr[k] = rightAges[j];
                nameArr[k++] = rightNames[j++];
            }
        }

        while (i < leftAges.length) {
            ageArr[k] = leftAges[i];
            nameArr[k++] = leftNames[i++];
        }

        while (j < rightAges.length) {
            ageArr[k] = rightAges[j];
            nameArr[k++] = rightNames[j++];
        }
    }
}

package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] scores = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        quickDescendingSort(scores, 0, scores.length - 1);
        System.out.println(scores[k - 1]);
    }

    public static void quickDescendingSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }

        int pivot = arr[high];
        int cursor = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] > pivot) {
                swap(arr, i, ++cursor);
            }
        }

        swap(arr, ++cursor, high);
        quickDescendingSort(arr, low, cursor - 1);
        quickDescendingSort(arr, cursor + 1, high);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

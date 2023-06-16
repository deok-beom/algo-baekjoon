package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_QuickSort {
    public static void recursiveQuickSort(int[] arr, int low, int high, int round) {
        if (low > high) {
            return;
        }

        int pivot = sort(arr, low, high, ++round);
        recursiveQuickSort(arr, low, pivot - 1, round);
        recursiveQuickSort(arr, pivot + 1, high, round);
    }

    public static int sort(int[] arr, int low, int high, int round) {
        int pivot = arr[high];
        int cursor = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                cursor++;
                swap(arr, i, cursor);
            }
        }

        swap(arr, cursor + 1, high);
        PrintArray.printRound(arr, low, high, round);
        return cursor + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = st.countTokens();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        PrintArray.printOriginal(arr);
        recursiveQuickSort(arr, 0, arr.length - 1, 0);
        System.out.print("정렬 후 : ");
        PrintArray.print(arr);
    }
}

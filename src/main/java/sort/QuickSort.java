package sort;

public class QuickSort {

    public static void sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }

        int pivot = arr[high];
        int cursor = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, ++cursor, i);
            }
        }

        swap(arr, ++cursor, high);
        sort(arr, low, cursor - 1);
        sort(arr, cursor + 1, high);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

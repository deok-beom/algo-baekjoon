package step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        quickSort(nums, 0, nums.length - 1);
        System.out.println(sum / 5);
        System.out.println(nums[2]);
    }

    public static void quickSort(int[] arr, int low, int high) {
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
        quickSort(arr, low, cursor - 1);
        quickSort(arr, cursor + 1, high);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

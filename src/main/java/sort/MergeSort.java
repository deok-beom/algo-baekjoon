package sort;

public class MergeSort {
    public void recursiveSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        // 분할 (Divide)
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        recursiveSort(left);
        recursiveSort(right);

        merge(left, right, arr);
    }

    public void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        // 정복(Conquer), 결합(Combine)
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

}

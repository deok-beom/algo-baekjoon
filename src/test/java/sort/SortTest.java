package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class SortTest {

    @Test
    void bubbleSort() {
        // Given
        int[] arr = new int[]{5, 7, 10, 1, 4, 6, 0, 8, 9, 3};

        // When
        BubbleSort.sort(arr);

        // Then
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

    @Test
    void selectionSort() {
        // Given
        int[] arr = new int[]{5, 7, 10, 1, 4, 6, 0, 8, 9, 3};

        // When
        SelectionSort.sort(arr);

        // Then
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

    @Test
    void insertionSort() {
        // Given
        int[] arr = new int[]{5, 7, 10, 1, 4, 6, 0, 8, 9, 3};

        // When
        InsertionSort.sort(arr);

        // Then
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

    @Test
    void quickSort() {
        // Given
        int[] arr = new int[]{5, 7, 10, 1, 4, 6, 0, 8, 9, 3};

        // When
        QuickSort.sort(arr, 0, arr.length - 1);

        // Then
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }

    @Test
    void heapSort() {
        // Given
        int[] arr = new int[]{5, 7, 10, 1, 4, 6, 0, 8, 9, 3};

        // When
        HeapSort.sort(arr);

        // Then
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9, 10}, arr);
    }
}
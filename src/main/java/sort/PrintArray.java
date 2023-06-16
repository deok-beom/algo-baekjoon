package sort;

public class PrintArray {
    public static void printOriginal(int[] arr) {
        System.out.print("원본 : ");
        print(arr);
    }

    public static void printRound(int[] arr, int round) {
        System.out.printf("%d회차 : ", round);
        print(arr);
    }

    public static void printRound(int[] arr, int start, int end, int round) {
        System.out.printf("%d회차 : ", round);
        printPiece(arr, start, end);
    }

    public static void printPiece(int[] arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("]");
    }

    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println("]");
    }
}

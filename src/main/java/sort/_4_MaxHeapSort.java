package sort;

public class _4_MaxHeapSort {

    public static class MaxHeap {
        int size;
        int maxSize;
        int[] heap;

        public MaxHeap(int maxSize) {
            this.size = 0;
            this.maxSize = maxSize;
            this.heap = new int[maxSize];
        }

        public void insert(int num) {
            if (this.size == this.maxSize) {
                System.out.println("힙의 용량이 최대입니다.");
                return;
            }

            heap[this.size] = num;

            int cursor = this.size;
            int parentIndex = (this.size - 1) / 2;
            while (cursor > 0 && heap[parentIndex] < heap[cursor]) {
                cursor = swap(cursor, parentIndex);
                parentIndex = (cursor - 1) / 2;
            }

            ++this.size;
        }

        public int extract() {
            if (size == 0) {
                System.out.println("힙의 용량이 최소입니다.");
            }

            int poppedNum = heap[0];
            swap(0, size - 1);
            sort(0);
            return poppedNum;
        }

        public void sort(int index) {
            if (index >= size / 2 && index < size) {
                return;
            }

            if (index * 2 + 1 >= size) {
                return;
            } else if (index * 2 + 2 >= size) {
                index = swap(index, index * 2 + 2);
            } else {
                if (heap[index * 2 + 1] > heap[index * 2 + 2]) {
                    index = swap(index, index * 2 + 1);
                } else {
                    index = swap(index, index * 2 + 2);
                }
            }

            sort(index);
        }

        public int swap(int a, int b) {
            int temp = heap[a];
            heap[a] = heap[b];
            heap[b] = temp;
            return b;
        }

        public void print() {
            for (int i = 0; i < size / 2; i++) {
                System.out.print("Parent: " + heap[i] + ", Left Child: " + heap[2 * i + 1]
                        + ", Right Child: " + heap[2 * i + 2]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.printf("Popped: %d%s", maxHeap.extract(), System.lineSeparator());
        maxHeap.print();
    }
}

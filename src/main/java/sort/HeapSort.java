package sort;

public class HeapSort {

    public static class Heap {
        int size;
        int maxSize;
        int[] heap;

        public Heap(int maxSize) {
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
            swap(0, --size);
            sort(0);
            return poppedNum;
        }

        public void sort(int index) {
            if (index >= size / 2 && index < size) {
                return;
            }

            int left = index * 2 + 1;
            int right = index * 2 + 2;

            if (left >= size) {
                return;
            } else if (right >= size) {
                index = swap(index, left);
            } else {
                if (heap[left] > heap[right]) {
                    index = swap(index, left);
                } else {
                    index = swap(index, right);
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
    }

    public static void sort(int[] arr) {
        Heap heap = new Heap(arr.length);
        for (int num : arr) {
            heap.insert(num);
        }

        for (int i = arr.length - 1; i >= 0; --i) {
            arr[i] = heap.extract();
        }
    }
}

package binary_heap;

class MinHeap {
    private int heapSize;
    private int[] heap;

    MinHeap(int maxArraySize) {
        heapSize = 0;
        heap = new int[maxArraySize + 1];
    }

    private boolean isFull() {
        return heapSize == heap.length;
    }

    private boolean isEmpty() {
        return heapSize == 0;
    }

    private int index_parent(int i) {
        return (i - 1) / 2;
    }

    private int index_child(int i, int k) {
        return 2 * i + k;
    }

    void insert_minHeap(int x) {
        if (isFull()) {
            System.out.println("Array Full!");
        }
        heap[heapSize] = x;
        percolateUp_minHeap(heapSize++);
    }

    int deleteMin() {
        int index = 0;
        if (isEmpty()) {
            System.out.println("Array Empty!");
        }
        int keyItem = heap[index];
        heap[index] = heap[heapSize - 1];
        heapSize--;

        percolateDown_minHeap(index);

        return keyItem;
    }

    private void percolateDown_minHeap(int index_parent) {
        int child;
        int temp = heap[index_parent];

        while (index_child(index_parent, 1) < heapSize) {
            child = minimumChild(index_parent);

            if (heap[child] < temp) {
                heap[index_parent] = heap[child];
            } else break;
            index_parent = child;
        }
        heap[index_parent] = temp;
    }

    private int minimumChild(int index) {
        int minChild = index_child(index, 1);
        int k = 2;
        int child_2 = index_child(index, k);

        while (k <= 2 && child_2 < heapSize) {
            if (heap[child_2] < heap[minChild]) {
                minChild = child_2;
            }
            k++;
        }
        return minChild;
    }


    private void percolateUp_minHeap(int idxChild) {
        int temp = heap[idxChild]; //Menampung child

        /*Percolate Up (dari level bawah ke root)
         * berhenti jika salah satu kondisi bernilai false*/
        while (idxChild > 0 && temp < heap[index_parent(idxChild)]) {
            heap[idxChild] = heap[index_parent(idxChild)]; //Isi dengan element parent
            idxChild = index_parent(idxChild); //Index child diisi dengan index parent
        }

        heap[idxChild] = temp;
    }

    void printHeap() {
        System.out.print("Min Heap : ");
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

}

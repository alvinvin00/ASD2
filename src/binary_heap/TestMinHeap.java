package binary_heap;

public class TestMinHeap {

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert_minHeap(11);
        heap.insert_minHeap(5);
        heap.insert_minHeap(6);
        heap.insert_minHeap(1);
        heap.insert_minHeap(2);
        heap.insert_minHeap(0);
        heap.insert_minHeap(7);
        heap.insert_minHeap(6);
        heap.insert_minHeap(3);

        heap.printHeap();

        heap.deleteMin();
        heap.deleteMin();

        heap.printHeap();

    }


}

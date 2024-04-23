import java.util.*;

class MinHeap {
    List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    // Helper function to maintain the heap property by moving the element up
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index) < heap.get(parentIndex)) {
                // Swap elements
                int temp = heap.get(index);
                heap.set(index, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    // Function to insert a new element into the heap
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // Function to print the heap array
    public void printHeap() {
        for (int num : heap) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
public class Insertion_in_a_Heap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        MinHeap minHeap = new MinHeap();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            minHeap.insert(num);
            System.out.println(num);
            minHeap.printHeap();
        }
    }
}
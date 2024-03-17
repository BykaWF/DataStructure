package heap;

class Heap {
    int[] arr;
    int size;
    int capacity;

    public Heap(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    int right(int i) {
        return (2 * i) + 1;
    }

    int left(int i) {
        return (2 * i) + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void insert(int key) {
        if (size != capacity) {
            size++;
            arr[size - 1] = key;
            int i = size - 1;
            while (i != 0 && arr[parent(i)] > arr[i]) {
                swap(arr, arr[i], arr[parent(i)]);
                i = parent(i);
            }
        } else {
            return;
        }
    }


    void heapify(int i) {

        int left = left(i);
        int right = right(i);
        int smallest = i;

        if (arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest == i) {
            return;
        } else {
            swap(arr, i, smallest);
            heapify(smallest);
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void decreaseKey(int i, int x){
        arr[i] = x;

        while (i != 0 && arr[parent(i)] > arr[i]){
            swap(arr,i,parent(i));
            i = parent(i);
        }
    }

    void delete(int i){
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    void extractMin(){
        // swap last element with root and then heapify
        swap(arr,0, size - 1);
        size--;
        heapify(0);
    }

    void buildHeap(){

        for (int i = (size - 2) / 2; i >= 0; i--){
            heapify(i);
        }
    }

    //selection sort algo : we find max element and swap it with last one


}

public class MyHeap {
}

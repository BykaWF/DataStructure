package heap;

public class MinHeap {

    int[] arr;
    int size;
    int capacity;

    public MinHeap(int c) {
        this.arr = new int[c];
        this.capacity = c;
    }

    int left(int i) {
        return (2 * i) + 1;
    }

    int right(int i) {
        return (2 * i) + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void insert(int element){
        if(size != capacity){
            size++;
            arr[size - 1] = element;

            int i = size - 1;

            while (arr[i] > parent(i) || i != 0){
                swap(arr,i, parent(i));
                i = parent(i);
            }

        }else {
            System.out.println("Min Heap is full");
            return;
        }
    }

    void heapify(int i){
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if(left < size && arr[smallest] > arr[left]){
            smallest = left;
        }

        if(right < size && arr[smallest] > arr[ right]){
            smallest = right;
        }

        if(smallest != i){
            swap(arr,i, smallest);
            heapify(i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    int extractMin(){

        int extractedMin = arr[0];
        // was my first idea
//        for (int i = 1; i < size; i++){
//            arr[i - 1] = arr[i];
//        }

        swap(arr,0, size - 1);
        size--;

        heapify(0);


        return extractedMin;
    }

}

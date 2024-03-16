package heap;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {10,15,50,4,20};

        heapSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr, int n){
        buildHeap(arr,n); // build max heap

        for (int i = n - 1; i >= 1; i--){
            swap(arr,0,i); // swap root with last element ( like selection sort, as we know root is max element in heap
            maxHeapify(arr,0,i); // make our root max and use 'i' like a size;
        }
    }

    private static void buildHeap(int[] arr, int length) {

        for (int i = (length - 2) / 2; i >= 0; i--){
            maxHeapify(arr,i,length);
        }
    }

    private static void maxHeapify(int[] arr, int index, int size){
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;
        int largest = index;

        if(left < size && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != index){
            swap(arr,index,largest);
            maxHeapify(arr,largest,size);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

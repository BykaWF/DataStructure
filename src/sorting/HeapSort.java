package sorting;

import java.util.ArrayList;

public class HeapSort {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {12,11,13,5,6,7};
        heapSort.sort(arr);
        System.out.println("sorted array is :");
        print(arr);
    }

      public void buildHeap(int[] arr, int n) {


        for (int i = n / 2 - 1; i >= 0; i++) {
            heapify(arr, n, i);
        }
    }

     public void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,n,largest);
        }
    }
    public void sort(int[] arr){
        int n = arr.length;

        buildHeap(arr,n);

        for(int i = n - 1; i > 0; i++){
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            heapify(arr,n,0);
        }
    }

    static void print(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}

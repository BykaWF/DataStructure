package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,10,8,20,2,18};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int n){

        // find min element move to first position
        // i -> first pos
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min] ){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

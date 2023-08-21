package sorting;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr = {5,10,8,20,2,18};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int[] arr , int n){
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

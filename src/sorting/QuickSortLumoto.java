package sorting;

import java.util.Arrays;

public class QuickSortLumoto {
    public static void main(String[] args) {
        int[] arr = { 5,10,20,4,2,1,6};
        quickSort(arr,0,arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[]arr, int l, int h){
        if(l < h){
            int p = portion(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    static int portion(int[] arr, int l, int h){
        int pivot = arr[h];

        int i = l - 1;

        for (int j = l; j <= h - 1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}


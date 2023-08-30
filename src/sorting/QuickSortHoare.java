package sorting;

import java.util.Arrays;

public class QuickSortHoare {
    public static void main(String[] args) {
        int[] arr = { 5,10,20,4,2,1,6};

        qSort(arr,0,arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void qSort(int[] arr, int l, int h){
        if(l < h){
            int p = portion(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }

    private static int portion(int[] arr, int l, int h){
        int pivot = arr[l];

        int i = l-1;
        int j = h + 1;

        while (true){
            do {
                i++;
            }while (arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if(i >= j) return j;
            swap(arr,i,j);

        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

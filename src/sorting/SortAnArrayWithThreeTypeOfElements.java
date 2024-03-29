package sorting;

import java.util.Arrays;

public class SortAnArrayWithThreeTypeOfElements {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,2,1};
        DutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void DutchNationalFlag(int[] arr){

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

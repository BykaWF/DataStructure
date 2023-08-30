package sorting;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {10,20,5,30};
        int k = 3;
        System.out.println(kthSmall2(arr,k,0,arr.length));
    }

    static int kthSmall(int[] arr, int k ){
        Arrays.sort(arr);

        return arr[k - 1];
    }

    static int kthSmall2(int[] arr, int k, int low,int high){

        while (low < high) {

           int p = portion(arr,low,high - 1);

            if (p == k - 1) {
                return arr[p];
            } else if (p > k - 1) {
                high = p - 1;
            } else {
                low = p + 1;
            }
        }

        return -1;
    }

    static int portion(int[] arr, int low, int high){
        int pivot = arr[low];

        int i = low - 1;
        int j = high + 1;

        while (true){
            do {
                i++;
            }while (arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if(i>=j) return j;
            swap(arr,i,j);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

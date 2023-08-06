package array;

import java.util.Arrays;

public class RotateBy1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        leftRotateOne(arr,3);

        System.out.println(Arrays.toString(arr));
    }

    static void leftRotateOne(int[] arr, int n){

        int start = 0;
        for (int i = 1; i < n; i++) {
            swap(arr,start,i);
            start++;
        }
    }
    static void leftRotateD(int[] arr, int d){
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr, arr.length);
        }
    }



    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void leftRotateDTime(int[] arr,int d){
        int[] temp = new int[d];
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d - i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int d ){
        int n = arr.length;
        if(d > n){
            d = d % n;
        }

       reverse(arr,0,d-1);
       reverse(arr,d,n-1);
       reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int low, int high){
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }


}

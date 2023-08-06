package array;

import java.util.Arrays;

public class Rerange {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        rearrange(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(long arr[], int n){
        int i = 0;
        int j = n - 1;
        int max = (int)arr[n- 1] + 1;
        while(i < j){

            arr[i] = arr[j] * max + arr[i];

            i++;
            j--;
        }

    }
}

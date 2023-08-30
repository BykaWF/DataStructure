package sorting;

import java.util.Arrays;

import static sorting.KthSmallest.swap;

public class SegPosNeg {
    public static void main(String[] args) {
        int[] arr = {15,-3,-2,18};
        segPostNeg(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void segPostNeg(int[]arr){

        int i = -1;
        int j = arr.length;;
        while (true){
            do {
                i++;
            }while (arr[i] < 0);

            do {
                j--;
            }while (arr[j] >= 0);
            if(i >= j) return;
            swap(arr,i,j);
        }
    }
}

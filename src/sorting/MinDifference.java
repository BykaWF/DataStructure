package sorting;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(minDiffer(arr));
    }

    static int minDiffer(int[] arr){
        if(arr.length == 1){
            return Integer.MAX_VALUE;
        }
        // 1,5,8,12,18
        Arrays.sort(arr);

        int difference = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++){
            int x = arr[i] - arr[i -1];
            difference = Math.min(difference,x);
        }

        return difference;
    }
}

package sorting;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,9,12,56};
//        System.out.println(getDiffer(arr,3, arr.length));
        System.out.println("Hello" + 100 + 100);
        System.out.println(100+100+"Hello");
    }

    static int getDiffer(int[] arr, int m, int n){
        if(m > n){
            return -1;
        }
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;

        for (int i = 0; (i + m -1) < n; i++) {
            res = Math.min(res,arr[i+ m -1] - arr[i]);
        }

        return res;
    }
}

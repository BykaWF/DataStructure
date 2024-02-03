package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubbarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 1, 8, 2, 3, 6};
        int sum = 5;
        int[] a = { 1, 1, 1,0,0,0};
//        System.out.println(longestSub(a));
        System.out.println(longestSubEf(a));
//        System.out.println(hasSum(arr, sum));
    }

    private static int longestSub(int[] a) {
        int res = 0;

        for (int i = 0; i < a.length; i++) {

            int c1 = 0;
            int c0 = 0;

            for (int j = i; j < a.length; j++) {

                if (a[j] == 1) {
                    c1++;
                } else {
                    c0++;
                }

                if (c1 == c0) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    private static int longestSubEf(int[] a){
        HashMap<Integer,Integer> hm = new HashMap<>();

        int res = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == 0){
                a[i] = -1;
            }
        }

        res = hasSum(a,0);

        return res;
    }


    private static int hasSum(int[] arr, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int preSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == sum) {
                res = i + 1;
            }

            if (!hm.containsKey(preSum)) {
                hm.put(preSum, i);
            }

            if (hm.containsKey(preSum - sum)) {
                res = Math.max(res, i - hm.get(preSum - sum));
            }
        }

        return res;
    }
}

package hashing;

import java.util.HashMap;

public class LongestCommonSubWithGivenSum {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 1, 1, 1};
        int[] b = {1, 1, 1, 1, 1, 0, 1};

        System.out.println(longestSub(a, b));
        System.out.println(longestSubEf(a,b));
    }

    private static int longestSub(int[] a, int[] b) {
        int res = 0;
        int sum1 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int preSum = 0;

        for (int i = 0; i < b.length; i++) {
            preSum += b[i];

            if (preSum == sum1) {
                res = i + 1;
            }

            if (!hm.containsKey(preSum)) {
                hm.put(preSum, i);
            }

            if (hm.containsKey(preSum - sum1)) {
                res = Math.max(res, i - hm.get(preSum - sum1));
            }
        }

        return res;
    }

    private static int longestSubEf(int[] a, int[] b){
        int res = 0;
        int[] temp = new int[a.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i] - b[i];
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        int preSum = 0;
        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            preSum += temp[i];

            if (preSum == k){
                res = i + 1;
            }

            if(!hm.containsKey(preSum)){
                hm.put(preSum,i);
            }

            if(hm.containsKey(preSum - k)){
                res = Math.max(res, i - hm.get(preSum-k));
            }
        }

        return res;
    }
}

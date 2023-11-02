package array;

import java.util.Arrays;
import java.util.HashSet;

public class Delete {
    public static void main(String[] args){
            int[] arr = {1,2,1}; // 17
        System.out.println(maxSubarraySumCircular(arr));
        System.out.println(maxTurbulenceSize(arr));
        System.out.println(containsNearbyDuplicate(arr, 1));
    }

    public static int maxSubarraySumCircular(int[] nums) {

        int maxSum = nums[0];
        int currSum = 0;

        for(int i = 0; i < nums.length; i++){

            currSum = Math.max(currSum, 0);
            currSum += nums[(i - 1 + nums.length) % nums.length];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public  static int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;

        int L = 0;
        int R = 1;
        int res = 1;
        int curr = 1;
        String prev = "";

        while(R < arr.length){
            if(arr[R-1] > arr[R] && !prev.equals(">")){
                curr++;
                res = Math.max(res , curr);
                R++;
                prev = ">";
            }else if (arr[R-1] < arr[R] && !prev.equals("<")){
                curr++;
                res = Math.max(res , curr);
                R++;
                prev = "<";
            }else{
                R = arr[R] == arr[R-1] ? R + 1 : R;
                L = R-1;
                prev = "";
                curr = 1;
            }
        }
        return res;
    }

    public  static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                return true;
            }else if(Math.abs(i-j) >= k){
                i++;
                j++;
            }else {
                j++;
            }
        }
        return false;
    }
}

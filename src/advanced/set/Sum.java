package advanced.set;

import java.util.HashSet;

public class Sum {
    public static void main(String[] args){
        int[] arr = {3,2,8,15,-8};

        System.out.println(hasSum(arr,17));
    }

    static boolean hasSum(int[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(sum - arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
        }

        return false;
    }
}

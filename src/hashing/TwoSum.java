package hashing;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,1,6,3};
        int sum = 6;


        twoSum(a,sum);
    }

    private static void twoSum(int[] a, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {

            if(hashSet.contains(sum - a[i])){
                System.out.println("🤪");
                return;
            }
            hashSet.add(a[i]);

        }

        System.out.println("🤔");
    }
}

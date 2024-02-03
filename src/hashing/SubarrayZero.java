package hashing;

import java.util.HashSet;

public class SubarrayZero {

    public static void main(String[] args) {
        int[] a = {1, 4, 13, -3, -10, 5};

        System.out.println(is0Subarray(a));

    }

    private static boolean is0Subarray(int[] a) {
        HashSet<Integer> hs = new HashSet<>();

        int preSum = 0;

        for (int i = 0; i < a.length; i++) {
            preSum += a[i];

            System.out.print("Hash " + hs + " contains: " + preSum + " ?");

            if (hs.contains(preSum)) {
                return true;
            }

            if (preSum == 0) {
                return true;
            }

            System.out.print(" NOPE. Add to hash " + preSum);
            hs.add(preSum);

            System.out.println();
        }
        return false;
    }
}

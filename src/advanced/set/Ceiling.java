package advanced.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Ceiling {
    public static void main(String[] args) {
        printCeiling(new int[] {10,100,200,30,120,120});
    }

    static void printCeiling(int[] arr){
        int n = arr.length;
        TreeSet<Integer> ts = new TreeSet<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0 ; i--) {
            Integer ceil = ts.ceiling(arr[i]);
            if(ceil == null){
                res[i] = -1;
            }else {
                res[i] = ceil;
            }
            ts.add(arr[i]);
        }

        for(int x : res){
            System.out.print(x + " ");
        }
    }
}

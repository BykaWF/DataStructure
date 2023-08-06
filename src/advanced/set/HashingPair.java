package advanced.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashingPair {
    public static void main(String[] args) {

        int[] arr = {10,8,10,7,7,6};
        //printUnique(arr);
        printRepeat(arr);
    }

    static void printUnique(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                System.out.print(arr[i] + " ");
                set.add(arr[i]);
            }
        }
    }

    static void printRepeat(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }
}

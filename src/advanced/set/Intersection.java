package advanced.set;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,30,50};
        int[] b = {30,5,15,80};

        printIntersection(a,b);
    }

    // O(A + B) - any order
    static void printIntersection(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < b.length; i++) { // O (A)
            set.add(b[i]);
        }

        for (int j = 0; j < a.length; j++){ // O (B)
            if(set.contains(a[j])){
                System.out.println(a[j]);
            }
        }
    }


}

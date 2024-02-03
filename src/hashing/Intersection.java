package hashing;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {10,15,20,25,30,50};
        int[] b = {30,5,15,80};

        intersect(a,b);

    }
//    find the intersection of the arrays and print the elements according to the order of occurrence in the first array
    public static void intersect(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : b){
            hs.add(i);
        }

        for (int i = 0; i < a.length; i++) {
            if(hs.contains(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
}

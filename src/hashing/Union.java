package hashing;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};
        union(a,b);
    }

    private static void union(int[] a, int[] b) {
        HashSet<Integer> hashSet = new HashSet<>();

        int i = 0;

        while (i < a.length && i < b.length){
            hashSet.add(a[i]);
            hashSet.add(b[i]);
            i++;
        }

        if(a.length > b.length){
            while (i < a.length){
                hashSet.add(a[i]);
                i++;
            }
        }else {
            while (i < b.length){
                hashSet.add(b[i]);
                i++;
            }
        }

        System.out.println(hashSet.size());
    }
}

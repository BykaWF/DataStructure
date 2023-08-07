package serching;

import java.util.Arrays;

public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {

    }

    static int binarySearch(int[] arr,int x){
        if(arr[0] == x){
            return 0;
        }

        int i = 1;

        while (arr[i] < x){
            i = i * 2;
        }

        if(arr[i] == x) return i;

        return Arrays.binarySearch(arr,x);
    }
}

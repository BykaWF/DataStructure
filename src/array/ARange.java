package array;

import java.util.Arrays;

public class ARange {
    public static void main(String[] args) {
        long arr[] = {4,0,1,2,3};
        arrange(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void arrange(long arr[], int n)
    {


        for(int i = 0; i < n; i++){
            long x = arr[i];
            long y = arr[(int)x];
            arr[i] = x + (y%n) * n;
    }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}

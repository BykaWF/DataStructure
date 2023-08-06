package array;

import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
       // System.out.println(getPoint(arr,arr.length));

        System.out.println( getPoint2(arr,arr.length));
    }

    static int getPoint(int[] arr, int n){
        int sum = 0;

        for (int i = 0; i < n; i++){
            int sumJ = 0;
            for (int j = i + 1; j < n; j++) {
                sumJ += arr[j];
            }

            if(sum == sumJ){
                return i ;
            }else {
                sum+= arr[i];
            }
        }

        return -1;
    }

    static int getPoint2(int[] arr, int n){
        int totalSum = arr[0];

        for (int i = 1; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if(totalSum ==leftSum){
                return i;
            }
            leftSum+=arr[i];

        }


        return -1;
    }
}

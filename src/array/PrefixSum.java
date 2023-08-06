package array;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,1};
        int n = arr.length;
        prefixSum(arr,n);
    }

    static void prefixSum (int[] arr, int n){
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        int power = 2;

        for (int i = 1; i < n; i++){
            prefixSum[i] = (arr[i] * power) + prefixSum[i - 1];
            power++;
        }

        getSum(prefixSum,2,3);
    }

    static void getSum(int[] arr, int l, int r){
        if(l == 0){
            System.out.println(arr[r]);
        }else {
            System.out.println(arr[r] - arr[l]);
        }
    }




}

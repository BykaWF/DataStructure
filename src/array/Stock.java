package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Stock {
    public static void main(String[] args) {
        int[]arr = {4,2,2,2,4};
        int n  = arr.length;
        ArrayList<ArrayList<Integer>> res = stockBuySell(arr,n);
        System.out.println(res);

    }

    static ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {

        ArrayList<ArrayList<Integer> > result = new ArrayList<>();

        for(int i= 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i - 1);
                list.add(i);

                result.add(list);
            }
        }
        return result;
    }
}

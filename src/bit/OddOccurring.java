package bit;

import java.util.ArrayList;
import java.util.Arrays;

public class OddOccurring{
    public static void main(String[] args) {
        int[] arr = {1,6,5,6,6,13};
        //findOdd3(arr);
    }

    static int findOdd(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int occur = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    occur++;
                }
            }
            if(occur % 2 != 0){
                return arr[i];
            }
        }
        return -1;
    }

    static int findOddEf(int[] arr){
        int res = arr[0];
        for (int i = 1; i < arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }

    static void findOdd2(int[] arr){


        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count % 2 !=0){
                System.out.print(arr[i] + " ");
            }
        }
    }

}



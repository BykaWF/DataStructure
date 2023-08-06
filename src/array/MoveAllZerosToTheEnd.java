package array;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr ={8,5,0,10,0,20};
        moveToEnd2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveToEnd(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] != 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }
    }

    static void moveToEnd2(int[] arr){

       int count = 0; // save position when last we get non-zero value

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

    }
}

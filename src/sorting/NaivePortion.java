package sorting;

import java.util.Arrays;

public class NaivePortion {
    public static void main(String[] args) {
        int[] arr = {5,13,6,9,12,11,8};
        int p = 6;

        portion(arr,p, arr.length - 1,0);

        System.out.println(Arrays.toString(arr));
    }

    static void portion(int[]arr,int p, int h, int l){
        int[] temp = new int[h-l + 1];
        int index = 0;
        for (int i = l; i <= h; i++){
            if(arr[i] <= arr[p] && i!= p){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];
        for (int i = l; i <=h; i++ ){
            if(arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = l; i <=h; i++){
            arr[i] = temp[i];
        }
    }

}

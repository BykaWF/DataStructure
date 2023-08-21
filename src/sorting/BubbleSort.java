package sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr= {2,10,8,7};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[]arr){
        int n = arr.length;

        // arr[i] > arr[i+1] swap
        //n-1
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n -i- 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }else {
                    swapped = false;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


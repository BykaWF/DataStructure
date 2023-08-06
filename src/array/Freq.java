package array;

import java.util.Arrays;

public class Freq {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int N = arr.length;
        int P = arr.length;

        frequencyCount(arr,N,P);

        System.out.println(Arrays.toString(arr));
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        Arrays.sort(arr);

        int[] temp = new int[N];

        for(int i = 1; i <= P; i++){
            int count = 0;

            for(int j = 0; j < N; j++){
                if(i == arr[j]){
                    count++;
                }
            }
            temp[i - 1] = count;

        }

        for(int i = 0; i < N; i++){
            arr[i] = temp[i];
        }

    }
}

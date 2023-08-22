package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {10,15,20};
        int[] b = {5,6,6,15};
       // efficientMerge(a,b);

        int[] arr = {10,15,11,30};
        int low = 0;
        int high = arr.length - 1;
        int mid = low + ( high - low)/ 2;

       // subMerge2(arr,low,mid,high);
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    static void efficientMerge(int[] a, int[] b){
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length){

            if(a[i] <= b[j]){ // 5 < 10
                System.out.print(a[i] + " ");
                i++;
            }else{
                System.out.print(b[j] + " ");
                j++;

            }
        }

        while (i < a.length){
                System.out.print(a[i] + " ");
                i++;
        }

        while (j < b.length){
            System.out.print(b[j] + " ");
            j++;
        }
    }
// My variation
    static void subMerge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid;

        while (i < mid && j <= high){
            if(arr[i] <= arr[j]){
                System.out.print(arr[i] + " ");
                i++;
            }else {
                System.out.print(arr[j] + " ");
                j++;
            }
        }

        while (i < mid){System.out.print(arr[i] + " "); i++;}

        while (j <= high){ System.out.print(arr[j] + " "); j++;}

    }


    static void subMerge2(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] right = new int[n2];
        int[] left = new int[n1];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + low];
        }

        for (int i = 0; i < n2; i++) {
            right[i]= arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1){
            arr[k++] = left[i++];
        }

        while (j < n2){
            arr[k++] = right[j++];
        }
    }


    static void mergeSort(int[] arr,int left, int right){
        if(right > left){
            int mid = left + ( right - left)/2;
            mergeSort(arr,left,mid);

            mergeSort(arr,mid+1,right);

            subMerge2(arr,left,mid,right);
        }
    }

}

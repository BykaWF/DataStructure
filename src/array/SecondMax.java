package array;

public class SecondMax {

    public static void main(String[] args) {
        int[] arr = {1,4,20,12};

        int a = SecondMax2(arr);

        System.out.println(a);
    }

    static int secondMax(int[] arr){

       int largest = largest(arr,arr.length);

       int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if(res == -1){
                    return i;
                }else if (arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    static int largest(int[] arr, int n){
        int largest = 0;

        for (int i = 1; i < n ; i++) {
            if( arr[i] > arr[largest]){
                largest = i;
            }
        }

        return largest;
    }

    static int SecondMax2(int[] arr){
     int res = -1;
     int largest = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }

        return res;
    }
}

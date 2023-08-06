package array;

public class Sort {
    public static void main(String[] args) {
        int[]arr = {7,20,30,10};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        if(arr.length == 1) return true;

        for (int i = 1; i < arr.length; i++) {
           if(arr[i] < arr[i - 1]) {
               return false;
           }
        }
        return true;
    }
}

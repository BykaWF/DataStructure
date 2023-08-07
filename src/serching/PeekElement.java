package serching;

public class PeekElement {
    public static void main(String[] args) {
        int[] arr = {2,3,40,5,1,4,5};
        System.out.println(findPeek(arr));
    }

    static int findPeek(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = (start + end) / 2;

            if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])){
                return mid;
            }

            if(mid > 0 && arr[mid - 1 ] >= arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

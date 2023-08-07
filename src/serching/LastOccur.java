package serching;

public class LastOccur {
    public static void main(String[] args) {
        int[] arr = {5,5,5};
        System.out.println(lastOccur(arr,0,arr.length -1, 5));
        System.out.println(lastOccur2(arr,arr.length,5));
    }

    static int lastOccur(int[] arr, int start, int end, int x){
        if(start > end){
            return -1;
        }
        int mid = ( end + start) / 2;

        if(arr[mid] > x){ // 5,10,10,10,10,20,20
            return lastOccur(arr,start, mid - 1, x);
        }

        if(arr[mid] < x){
            return lastOccur(arr,mid + 1,end, x);
        }

        if (mid == arr.length-1 || arr[mid + 1] != x) {
            return mid;
        }else {
            return lastOccur(arr,mid + 1, end, x);
        }

    }

    static int lastOccur2(int[] arr, int n, int x){
        int start = 0;
        int end = n - 1;

        while (start <= end){

            int mid = (start + end) / 2;

            if(arr[mid] > x){
                end = mid - 1;
            }

            if(arr[mid] < x){
                start = mid + 1;
            }

            if(mid == n - 1 || arr[mid] != arr[mid + 1]){
                return mid;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

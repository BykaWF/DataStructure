package serching;

public class findFloor {
    public static void main(String[] args) {
        long[] arr = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(findFloor2(arr, arr.length, 9));
    }

    static int findFloor2(long[] arr, int n, long x) {

        if (x == 0) {
            return -1;
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if(arr[mid] == x){
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < x && arr[mid + 1] > arr[mid] ) {
                return mid;
            }else if (arr[mid] < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}

package serching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,15,25};
        System.out.println(binarySearch(arr,arr.length,25));
    }

    static int binarySearch(int[] arr, int n, int target){
        int start = 0;
        int end = n - 1;

        while (start <= end){
            int mid = (end + start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}

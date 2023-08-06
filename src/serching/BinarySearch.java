package serching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,15,25};
        int start = 0;
        int end = arr.length - 1;
        int target = 25;

        System.out.println(binarySearch2(arr,start,end,target));
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

    static int binarySearch2(int[] arr,int start , int end, int x){
        if(start > end){
            return -1;
        }

        int mid = (start + end ) / 2;

        if(arr[mid] == x){
            return mid;
        }
        if(arr[mid] > x){
            return binarySearch2(arr,start,mid - 1,x);
        }else {
            return binarySearch2(arr,mid + 1,end,x);
        }

    }
}

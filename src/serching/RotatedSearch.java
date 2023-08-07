package serching;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr = {100,500,10,20,30,40,50};

        System.out.println(search(arr,50,0,arr.length -1));
        System.out.println(search2(arr,50));
    }
    // My way to solve
    static int search(int[] arr, int x , int low, int high){
        int mid = (low + high)/2;

        int first = searchHalf(arr,x,mid + 1,high);
        if(first != -1) {
            return first;
        }else {
            return searchHalf(arr, x, low, mid - 1);
        }
    }

    static int searchHalf(int[] arr,int x, int low, int high){
        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;

        if(arr[mid] == x) {
            return mid;
        }

        if(arr[mid] > x){
            return searchHalf(arr,x,low,mid -1);
        }else {
            return searchHalf(arr,x,mid + 1,high);
        }
    }

    static int search2(int[] arr, int x){
        int start = 0;
        int end = arr.length -1;

        while (start <=end){
            int mid = (start + end) / 2;

            if (arr[mid] == x) return mid;

           if(arr[start] <= arr[mid]){
               if(x >= arr[mid] && x < arr[mid]){
                    end = mid -1;
               }else {
                   start = mid + 1;
               }
           }else {
                if(x > arr[mid] &&  x <= arr[end]){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
           }

        }
        return  -1;
    }
}

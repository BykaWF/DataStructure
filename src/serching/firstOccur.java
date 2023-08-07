package serching;

public class firstOccur {
    public static void main(String[] args) {
        int[] arr = {10,20,20,20,40,40};
        //System.out.println(firstOccurElement(arr,0, arr.length - 1, 20));
        System.out.println(firstOccurElement2(arr,20));
    }

    static int firstOccurElement(int[] arr, int start, int end, int x){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] > x){
            return firstOccurElement(arr,start, end - 1, x);
        }

        if(arr[mid] < x){
            return firstOccurElement(arr,mid + 1,end,x);
        }

        if(mid == 0 || arr[mid - 1] != arr[mid]){
            return mid;
        }else {
            return firstOccurElement(arr,0, mid - 1, x);
        }
    }

  public   static int firstOccurElement2(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;

        while (start<= end){
            int mid = (start + end ) / 2;

            if(arr[mid] > x){
                end = end - 1;
            }
            else if(arr[mid] < x){
                start = mid + 1;
            }else {
                if(mid == 0 || arr[mid - 1] != arr[mid] ){
                    return mid;
                }else {
                    end = mid - 1;
                }
            }


        }

        return -1;
    }
}

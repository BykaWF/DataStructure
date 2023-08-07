package serching;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,20,40};
//        System.out.println(findPair(arr,42));
//        System.out.println(findPair2(arr,42));
        System.out.println(findTriplet(arr,69));
    }

    static boolean findPair(int[] arr, int x){

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }

        }
        return false;
    }

    static boolean findPair2(int[] arr, int x){
        int start = 0;
        int end = arr.length -1;

        while (start <=end){
            if(arr[start] + arr[end] == x){
                return true;
            }else {
                if(arr[start] + arr[end] > x){
                    end--;
                }else {
                    start++;
                }
            }
        }
        return false;
    }

    static boolean findTriplet(int[] arr,int x){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end){

            if(arr[start] + arr[mid] + arr[end] == x){
                return true;
            }
            else if(arr[start] + arr[mid] + arr[end] > x){
                end--;
            } else  {
                start++;
            }

            if(start == mid){
                start = mid;
                mid = start + (end - start) / 2;
            }

            if(end == mid){
                end = mid;
                mid = start + (end - start) / 2;
            }
        }

        return false;
    }
}

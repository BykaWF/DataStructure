package array;

public class SlidingWindow {
    public static void main(String[] args){
        int[] arr = {100, 200, 300, 400};
        int n = arr.length;
        int k = 2;

        System.out.println(slidingWindow(arr,k,n));
    }

    static int sumK(int[] arr, int k, int n){
      int res = Integer.MIN_VALUE;

      for (int i = 0; i + k - 1 < n; i++){
          int sum = 0;
          for (int j = 0; j < k; j++){
              sum += arr[i+j];
          }
          res = Math.max(sum,res);
      }
      return res;
    }

    static int slidingWindow(int[] arr, int k, int n){

        int curr = 0;
        for (int i = 0; i < k; i++){ // 4
            curr += arr[i];
        }

        int res = curr;

        for (int j = k; j < n; j++){ //4 -
            curr = curr + arr[j] - arr[j - k];
            res = Math.max(curr,res);
        }

        return res;
    }
}

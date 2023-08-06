package array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-5, 1, -2, 3, -1, 2, -2};
        int n = arr.length;

        System.out.println(getMax2(arr,n));
    }
    static int getMax(int[] arr, int n){
        int res = arr[0];

        for (int i = 0; i < n ; i++) {
            int curr = 0;

            for (int j = i; j < n; j++) {
                curr = curr + arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    static int getMax2(int[] arr, int n ){
        int maxEnding = arr[0];
        int res = 0;
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }

        return res;
    }
}

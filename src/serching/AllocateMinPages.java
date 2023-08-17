package serching;

public class AllocateMinPages {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(minPages(arr,arr.length,3));

    }

    static int minPages1(int[] arr, int n, int k){
        if(k == 1){
            return sum(arr,0,n - 1);
        }
        if(n == 1){
            return arr[0];
        }
        int res = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            res = Math.min(res,Math.max(minPages(arr,i,k-1), sum(arr,i,n-1)));
            //0 - > 10
        }
        return res;
    }

    private static int sum(int[] arr, int b, int e) {
        int sum = 0;
        for (int i = b; i <= e; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static int minPages(int[] arr,int k, int n){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }

        int low = max;
        int high = sum;
        int res = 0;

        while (low <= high){
            int mid = (max + sum) / 2;

            if(isFeasible(arr,n,k,mid)){
                res = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean isFeasible(int[] arr, int n, int k, int ans){
        int req = 0;
        int sum = 0;

        for (int i = 0; i < n; i++){
            if(sum + arr[i] > ans ){
                req++;
                sum = arr[i];
            }else {
                sum += arr[i];
            }
        }
        return (req <= k);
    }
}

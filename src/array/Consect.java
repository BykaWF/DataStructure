package array;

public class Consect {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,0};
        int n = arr.length;

        System.out.println(getMaxCon(arr,n));
    }

    static int getMaxCon(int[] arr, int n){
        int res = 0;
        int count = 0;
        for (int i = n -1; i >= 0; i--) {
            if(arr[i] == 1){
                count++;
                res = Math.max(res, count);
            }
            if(arr[i] == 0){
                count = 0;
            }
        }

        return res;
    }
}

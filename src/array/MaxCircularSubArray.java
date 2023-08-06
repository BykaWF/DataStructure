package array;

public class MaxCircularSubArray {
    public static void main(String[] args) {
        int[] arr ={5,-2,3,4};
        System.out.println(geSumCircular(arr,arr.length));
    }

    static int getSumNormal(int[] arr, int n ){
        int maxEnding = arr[0];
        int maxSum = arr[0];




        for (int i = 1; i <n ; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            maxSum = Math.max(maxSum, maxEnding);
        }



        return maxSum;
    }

    static int geSumCircular(int[] arr, int n){
        int normalSum = getSumNormal(arr,n);

        if(normalSum < 0){
            return normalSum;
        }
        
        int arrSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum+=arr[i];
            arr[i] = -arr[i];
        }

        int maxCircular = arrSum + getSumNormal(arr,n);
        return Math.max(maxCircular,normalSum);
    }
}

package array;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};

        System.out.println(maxDiff2(arr));
    }

    static int maxDiff(int[] arr){

        int maxDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                maxDiff = Math.max(arr[j] - arr[i], maxDiff);
            }
        }

        return maxDiff;
    }

    static int maxDiff2(int [] arr){
        int maxDiff = arr[1] - arr[0];
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }

        return maxDiff;
    }
}

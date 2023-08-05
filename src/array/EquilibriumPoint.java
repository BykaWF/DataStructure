package array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {4,2,-2};
        System.out.println(getPoint(arr,arr.length));
    }

    static int getPoint(int[] arr, int n){
        int sum = 0;

        for (int i = 0; i < n; i++){
            int sumJ = 0;
            for (int j = i + 1; j < n; j++) {
                sumJ += arr[j];
            }

            if(sum == sumJ){
                return i;
            }else {
                sum+= arr[i];
            }
        }

        return -1;
    }
}

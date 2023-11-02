package array;

import java.lang.reflect.Array;
import java.util.Arrays;

class NumMatrix {
        int[][] prefixSum;
        public NumMatrix(int[][] matrix) {
            if (matrix == null) {
                throw new IllegalArgumentException("Input matrix is null");
            }

            int m = matrix.length;
            int n = matrix[0].length;
            prefixSum = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                            - prefixSum[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
            }

            System.out.println(Arrays.deepToString(prefixSum));
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return prefixSum[row2 + 1][col2 + 1]
                    - prefixSum[row2 + 1][col1]
                    - prefixSum[row1][col2 + 1]
                    + prefixSum[row1][col1];
        }

}
public class RemoveDuplicates2 {
    public static void main(String[] args){
        int[] nums = {-1,-1,0,1,1,0};
        int[] prefixLeft = new int[nums.length];
        int[] prefixRight = new int[nums.length];

        int n = nums.length;

        prefixLeft[n-1] = nums[n-1];
            for(int i = n - 2; i >= 0; i--){
                prefixLeft[i] += nums[i] + prefixLeft[i+1];
            }

            prefixRight[0] = nums[0];
            for(int i = 1; i < nums.length; i++){
                prefixRight[i] += nums[i] + prefixRight[i-1];
            }

        for(int i = 0; i < nums.length; i++){
            if(prefixLeft[i] == prefixRight[i]){
                System.out.println("here " + i);
                break;
            }
        }

        System.out.println(Arrays.toString(prefixLeft));
        System.out.println(Arrays.toString(prefixRight));
    }


}



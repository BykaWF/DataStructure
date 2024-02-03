package matrix;

import java.util.Arrays;

public class TransposeMatrix {
     static int n = 4;
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        transpose(matrix);
        Arrays.stream(matrix).forEach(e -> System.out.println(Arrays.toString(e) + " "));
    }

    /**
     * NAIVE APPROACH
     */
    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] answer = new int[matrix[0].length][matrix.length];


        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                answer[i][j] = matrix[j][i];
            }
        }
        return answer;
    }

    /**
     * EFFICIENT APPROACH
     */
    static void transpose(int mat[][])
    {

        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                swap(mat, i, j);
    }

    static void swap(int mat[][], int i, int j)
    {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

}

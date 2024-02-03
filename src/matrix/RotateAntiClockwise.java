package matrix;

import java.util.Arrays;

import static matrix.TransposeMatrix.n;


public class RotateAntiClockwise {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        reverse(matrix);

        Arrays.stream(matrix).forEach(e -> System.out.println(Arrays.toString(e) + " "));
        System.out.println("🥰");
    }

    static void reverse(int mat[][]) {

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                swap(mat, i, j);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[n - j - 1][i];
                mat[n - j - 1][i] = temp;

            }
        }
    }
    static void swap(int mat[][], int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}

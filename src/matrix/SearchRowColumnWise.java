package matrix;

public class SearchRowColumnWise {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 46},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int x = 1;

        searchX(matrix, x);
        System.out.println();
        searchEf(matrix,x);
    }

    private static void searchEf(int[][] matrix, int x) {
        int i = 0;
        int j = matrix.length - 1;

        while (i < matrix.length && j >= 0){
            if(x == matrix[i][j]){
                System.out.printf("Found at ( %s, %s )", i, j);
                return;
            } else if (x > matrix[i][j]) {
                i++;
            }else {
                j--;
            }
        }

        System.out.println("Not Found!");
    }

    private static void searchX(int[][] matrix, int x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.printf("Found at ( %s, %s )", i, j);
                    return;
                }
            }
        }
    }

}

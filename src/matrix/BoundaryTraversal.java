package matrix;

public class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        boundaryTrev(arr);
    }

    private static void boundaryTrev(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        if(r == 1){
            for (int i = 0; i < c; i++) {
                System.out.print(arr[0][i] + " ");
            }
        } else if (c == 1) {
            for (int i = 0; i < r; i++) {
                System.out.println(arr[i][0]);
            }
        }

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " " + "➡" + " "); // right
            }


            for (int j = 1; j < r; j++) {
                System.out.print(arr[j][c - 1] + " " + "⬇" + " "); // down
            }


            for (int j = c - 2; j >= 0; j--) {
                System.out.print(arr[r - 1][j] + " "); // left
            }

            for (int j = r - 2; j >= 0; j--) {
                System.out.print(arr[j][0] + " "); // up
            }
            break;
        }
    }
}
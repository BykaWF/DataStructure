package matrix;

public class Pattern {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        printPattern(arr);
    }

    private static void printPattern(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        boolean flag = true;

        for (int i = 0; i < r; i++){
            if(flag){
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                flag = false;
            }else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                flag = true;
            }
        }
    }
}

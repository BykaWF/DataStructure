package array;

public class FindMax {
    public static void main (String[] args) {
        int[] arr = {82, 63, 44, 74, 82, 99, 82};

        int a = maxIndexDiff(arr,arr.length);

        System.out.println(a);
    }

    static int maxIndexDiff(int A[], int N) {

        int max1 = 0;


        for(int i = 0; i < N; i++){
            for(int j = N-1; j >= i; j--){
                if(A[i] < A[j]){
                    max1 = Math.max(max1, j-i);
                }

            }
        }
        return max1;
    }
}

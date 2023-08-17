package serching;

public class RoofStepts {
    public static void main(String[] args) {
     int [] arr = {5,7};
        System.out.println(maxStep(arr,arr.length));
    }

    static int maxStep(int A[], int N)
    {

        int ans = 0;
        int prev = 0;

        for(int i = 1; i < N; i++){
            if(A[i - 1] < A[i]){
                prev++;
                ans = Math.max(ans,prev);
            }else{

                prev = 0;
            }
        }

        return ans;
    }
}

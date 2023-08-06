package array;

public class SubGivenSum {
    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        System.out.println(hasSum(arr,arr.length,17));
    }

    static boolean hasSum(int[] arr, int n, int sum){

        int startWin = 0;
        int endWin = 0;
        int curr = 0;

        for (endWin = 0; endWin < n ; endWin++) {
            curr += arr[endWin];

           while (curr > sum){
               curr = curr - arr[startWin];
               startWin++;
           }

            if(curr == sum){
                return  true;
            }
        }


        return false;
    }
}

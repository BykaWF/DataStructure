package serching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(getSquareRoot(14));
    }

    static int getSquareRoot(int x){
        int start = 1;
        int end = x;
        int ans = -1;

        while (start <=end){
            int mid = (start + end) /2;

            int sq = mid * mid;
            if(sq == mid){
                return mid;
            } else if (sq > x) {
                end = mid - 1;
            }else {
                start = mid + 1;
                ans = mid;
            }

        }

        return ans;
    }
}

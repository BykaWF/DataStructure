package math;

public class iterativePower {
    public static void main(String[] args) {
        int power = iterativePower(3,10);

        System.out.println(power);
    }

    static int iterativePower(int x, int n){
        int res = 1;
        while (n > 0){
            if(n % 2 != 0){ // if current bit is 1, we will do multiplication
                res = res * x;
            }
            x =x*x;
            n = n/2;
        }

        return res;
    }
}

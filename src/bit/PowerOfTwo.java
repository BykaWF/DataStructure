package bit;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerTwo2(8));
    }

    static boolean isPowerTwo(int n){
        if(n == 0) return false;

       while (n != 1){
           if(n % 2 != 0){
               return false;
           }
           n = n/2;
       }
        return true;
    }

    static boolean isPowerTwo2(int n){
        if(n == 0) return false;

        return (n &(n-1)) == 0; // unset most right set bit

        /*
            n = 4
            n-1 = 3

            4 = 0100
            3 = 0011
            --------
                0000

                means our num is power of two
         */
    }
}

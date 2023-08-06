package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        //int ans = sumDigits(551,0);
        int a = countDigits(999);
        System.out.println(a);
    }

    static int sumDigits(int n, int k){
        if( n == 0 ){
            return k;
        }
        return sumDigits(n/10,k+= n % 10) ;
    }

     static int countDigits(int n)
    {

        if(n == 0){
            return 1;
        }


        return countDigits(n/10);
    }
}

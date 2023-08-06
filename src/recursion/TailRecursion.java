package recursion;

public class TailRecursion {
    public static void main(String[] args) {
        System.out.println( tailFactorial(5,1));
    }

    static int tailFactorial(int n,int res){
        if(n == 0 || n == 1) return res;



        return tailFactorial(n-1, n * res);
    }
}

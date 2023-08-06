package recursion;

public class BaseCase {
    public static void main(String[] args){
        int fact = factorial(5,1);
        int fibonacci = fibo(5);
        int sumNatural = sum(5);

        System.out.println("Factorial the Number: " + fact + "/Fibonacci Number: " + fibonacci + "/Natural Sum: " + sumNatural);
    }

    static int factorial(int n, int k){
        if(n == 0 || n == 1) return k;

        return factorial(n - 1, n *k);
    }

    static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        /*
                if(n <= 1) return n;
         */

        return fibo(n - 1) + fibo(n - 2);
    }

    static int sum(int n){
        if(n == 0) return 0;

        return n + sum(n-1);
    }
}

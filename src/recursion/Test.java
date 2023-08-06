package recursion;

public class Test {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(f(513,2));
    }

    static int f(int n,int r){

        if(n > 0) return (n % r + f(n/r,r));
        else return 0;
    }
}

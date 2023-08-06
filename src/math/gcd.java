package math;

public class gcd {
    public static void main(String[] args) {
        int a = gcd(8, 2);

        System.out.println(a);
    }

    static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, b % a);
    }
}

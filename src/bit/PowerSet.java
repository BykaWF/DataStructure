package bit;

public class PowerSet {
    public static void main(String[] args) {
        String s ="abc";
        int n = 3;
        powerSet(s,3);
    }
    static void powerSet(String s, int n){
        n = (int)Math.pow(2,n);
        for (int i = 0; i < n; i++){
            if((((1 << i) & 1)) != 0){
                System.out.print("a");
            }
            if((((1 << (i-1) & 1))) != 0){
                System.out.print("b");
            }
            if((((1 & 1))) != 0){
                System.out.print("c");
            }


            System.out.println();
        }

    }
}

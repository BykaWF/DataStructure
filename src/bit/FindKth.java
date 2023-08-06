package bit;

public class FindKth {
    public static void main(String[] args) {

        boolean a = isSet(30,3);
        System.out.println(a);
    }

    static boolean isSet(int n, int k){
        // iterate to k position and check is it 0 or 1

        int temp = 1 << (k-1); // position k  = 2^k-1
        // int temp = n>> (k-1) // O(n/2^k-1) and check last position
        /*
            for(int i = 0; i < (k-1); i++){
                x = x * 2;
            }

            OR

            for(int i = 0; i < (k-1); i++){
                n=n/2;
            }

            if(n%1)
         */

        return (temp & 1) > 0;
    }
}

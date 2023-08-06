package bit;
/*
    Input: N = 18
    Output: 2
    Explanation: Binary representation of
    18 is 010010,the first set bit from the
    right side is at position 2.
 */
public class SetPosition {
    public static void main(String[] args) {
        int o = getFirstSetBit(18);
        System.out.println(o);

    }
    public static int getFirstSetBit(int n){


       return n &-n;
    }
}

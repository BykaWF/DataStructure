package geeksproblem;

public class RightMostBit {
    public static void main(String[] args) {
        int m = 54;
        int n = 4;

        posOfRightMostDiffBit(m,n);
    }
    public static void posOfRightMostDiffBit(int m, int n)
    {
        System.out.println(m ^ n);

    }
}

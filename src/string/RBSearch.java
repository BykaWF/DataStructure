package string;

public class RBSearch {
    static final int d = 256;
    static final int q = 101; // should be prime number

    static void RBSearch(String pat, String txt, int pattern, int text) {

        //Compute d ^ m - 1
        int h = 1; // d ^ m - 1
        for (int i = 1; i <= pattern - 1; i++)
            h = (h * d) % q;

        //Compute p and t0. We use horner rule
        int p = 0, t = 0;
        for (int i = 0; i < pattern; i++) {
            // p * d - is like prefix sum p[0] + p[1] + p[2] ....
            // first time d^ 0 then d^ 1 and the d^2.....
            p = (p * d + pat.charAt(i)) % q; // hash of pattern
            t = (t * d + txt.charAt(i)) % q; // hash of text first window
        }

        for (int i = 0; i <= (text - pattern); i++) {
            //Check for hit
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < pattern; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag) System.out.print(i + " ");
            }
            //Compute ti+1 using ti
            // Rolling hash function
            if (i < text - pattern) {
                // 6 - 1 * d ^ m-1 = 5 * d^0 + 2 = 7
                t = ((d * (t - txt.charAt(i) * h)) + txt.charAt(i + pattern)) % q; // hash of next window
                if (t < 0) t = t + q; // ensure that positive value we will have
            }
        }

    }

    public static void main(String args[]) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        System.out.print("All index numbers where pattern found: ");
        RBSearch(pat, txt, 4, 15);
    }
}

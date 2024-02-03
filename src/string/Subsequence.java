package string;

public class Subsequence {
    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ABD";

        System.out.println(isSubsequence(s1,s2));
    }

    private static boolean isSubsequence(String s1, String s2) {

        if(s1.length() < s2.length()) return false;
        int j = 0;
        for(int i = 0; i < s1.length() && j < s2.length(); i++){
            if(s1.charAt(i) == s2.charAt(j))
                j++;
        }

        return j == s2.length();
    }
}

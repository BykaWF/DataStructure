package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abbcbba";

        boolean a = isPalindrome(s,0,s.length()-1);

        System.out.println(a);
    }

    static boolean isPalindrome(String s, int start, int end){
        if(start >= end){
            return true;
        }

        return (s.charAt(start) == s.charAt(end)) && isPalindrome(s,start+1,end - 1);
    }
}

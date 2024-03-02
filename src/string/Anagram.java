package string;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(isAnagram(s1,s2));
    }

    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int j : arr) {
            if (j > 0) {
                return false;
            }
        }

        return true;
    }
}

package advanced.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "aab";
        String s2 = "bab";
        System.out.println(isAnagram(s,s2));
        System.out.println(isAnagram2(s,s2));

    }

    static boolean isAnagram(String s1, String s2){
        char[] a = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(a2);
        for(int i = 0; i < s1.length(); i++){
            if(a[i] != a2[i]){
                return false;
            }
        }
        return true;
    }

    static boolean isAnagram2(String s1, String s2){
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }



        for (int i = 0; i < 26; i++) {
            if(count[i] == 1 ){
                return false;
            }
        }

        return true;
    }
}

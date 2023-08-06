package advanced.string;

import java.util.Arrays;
import java.util.Collections;

public class Rotate {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abecd";
        char a = printExtra(s1,s2);
        System.out.println(a);
        char b = findExtra(s1,s2);
        System.out.println(b);
        char c = findExtra2(s1,s2);
        System.out.println(c);
    }
    static char printExtra(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if(a1[i] != a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }

    static char findExtra(String s1, String s2){
        int[] count = new int[26];

        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']--;
            count[s2.charAt(i) - 'a']++;
        }

        count[s2.charAt(s2.length()) - 'a']++;

        for (int i = 0; i < 26; i++){
            if(count[i] == 1){
                return (char) (i + 'a');
            }
        }
        return 0;
    }

    static char findExtra2(String s1, String s2){
        int res = 0;
        int n = s1.length();

        for (int i = 0; i < n; i++){
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        res = res ^ s2.charAt(n);

        return (char) res;
    }

}

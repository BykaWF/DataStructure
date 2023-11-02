package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";




        System.out.println(isPalindrome(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            if(substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxLength = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;
        int l = 0;

        for(int r = 0; r < s.length(); r++){

            int idx = s.charAt(r) - 'A';
            count[idx]++;

            maxCount = Math.max(maxCount, count[idx]);

            if((r - l + 1) - maxCount == k){
                maxLength = Math.max(maxLength, r - l + 1);
            }

            if((r - l + 1) - maxCount > k){
                count[s.charAt(l) - 'A']--;
                l++;
                maxCount = Integer.MIN_VALUE;
            }
        }

        return maxLength;
    }

    public  static boolean isPalindrome(String s) {

        String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = temp.length()-1;

        while(start <= end){
            if(temp.charAt(start) != temp.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

}

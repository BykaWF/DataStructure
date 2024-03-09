package string;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String text = "ababacab";
        String pattern = "aba";

        
       KMPalgo(text,pattern);

    }

    private static void fillLPS(String str, int[] lps) {
        lps[0] = 0;
        int len = 0;
        int i = 1;

        while (i < str.length()){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }else {
                    len = lps[len - 1];
                }
            }
        }
    }

    private static void KMPalgo(String text, String pattern){
        int[] lps = new int[pattern.length()];
        fillLPS(pattern,lps);
        int i = 0;
        int j = 0;

        while (i < text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            if(j == pattern.length()){
                System.out.println(i - pattern.length());
                j = lps[j -1];
            }
            }else if (i < text.length() && text.charAt(i) != pattern.charAt(j) ) {
                if(j == 0){
                    i++;
                }else {
                    j = lps[j - 1];
                }
            }
        }
    }



}

package string;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        String str = "mightandmagic";
        String str2 = "andmagicmigth";
        System.out.println(areRotations(str,str2));
    }

    public static boolean areRotations(String s1, String s2 )
    {
        for (int i = 0; i < s1.length(); i++) {
            s1 = rotate(s1);
            if(s1.equals(s2)){
                return true;
            }
        }
        return false;
    }
    static String rotate(String str){

        char ch = str.charAt(0);

        char[] arr = str.toCharArray();

        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = str.charAt(i);
        }

        arr[arr.length - 1] = ch;

        return String.valueOf(arr);
    }
}

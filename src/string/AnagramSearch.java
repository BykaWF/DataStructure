package string;

public class AnagramSearch {
    static final int CHAR = 256;
    public static void main(String[] args) {
        String text = "geekforgeeks";
        String pattern = "frog";

//        System.out.println(isPresent(text,pattern));
        System.out.println(isPresent(text,pattern));
    }

    static boolean areSame(int[] CT, int[] CP){
        for(int i=0;i<CHAR;i++){
            if(CT[i]!=CP[i])return false;
        }
        return true;
    }

    static boolean isPresent(String txt,String pat){
        int[] CT=new int[CHAR];int[] CP=new int[CHAR];
        for(int i=0;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(areSame(CT,CP))return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }

    private static boolean isPresentOld(String text, String pattern) {
        

        for (int i = 0; i < text.length(); i++){
            if(areAnagram(pattern,text,i)){
                return true;
            }
        }

        return false;
    }

    private static boolean areAnagram(String pattern, String text, int i) {
        int[] count = new int[26];

        for (int j = 0; j < pattern.length(); j++) {
            count[pattern.charAt(j) - 'a']++;
            count[text.charAt(j + i) - 'a']--;
        }

        for (int j = 0; j < count.length; j++) {
            if(count[j] != 0){
                return false;
            }
        }
        return true;
    }
}

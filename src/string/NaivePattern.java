package string;

public class NaivePattern {
    public static void main(String[] args) {
        String s1 = "ABCABCDABCD";
        String pattern = "ABCD";

        naivePattern(s1, pattern);
        System.out.println();
        naivePatterEf(s1,pattern);
    }

    private static void naivePattern(String s1, String pattern) {
        int m = pattern.length();
        int n = s1.length();
        for (int i = 0; i <= (n - m); i++) {
            int j;
            for (j = 0; j < m; j++)
                if (pattern.charAt(j) != s1.charAt(i + j))
                    break;

            if (j == m)
                System.out.print(i + " ");
        }
    }

    private static void naivePatterEf(String text, String pattern){

        for (int i = 0; i <= text.length() - pattern.length();) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }

            if(j == pattern.length()){
                System.out.print(i + " ");
            }
            if(j == 0){
                i++;
            }else {
                i = (i + j);
            }
        }



    }

}

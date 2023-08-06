package advanced.stack;

import java.util.Stack;

public class Duplicates {
    public static void main(String[] args) {
        String str = "aaabbaaccd";
        String a = removePair(str);

        System.out.println(a);
    }

    public static String removePair(String str)
    {
        if(str.length() == 1){
            String a = "";
            a+= str.charAt(0);
            return a;
        }

        Stack<Character> st = new Stack<>();
        String res = "";

        st.push(str.charAt(str.length() - 1));

        for(int i = str.length() - 2; i >= 0; i--){
            if(!st.isEmpty() && str.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }

        while(!st.isEmpty()){
            res += st.pop();
        }

        return res;

    }
}

package advanced.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "{[()]}";

        System.out.println(hasBalance(str));
    }

    static boolean hasBalance(String str){
        Deque<Character> st = new ArrayDeque<>();
        // Keep pushing opening brackets if you see closing brackets check is it top of stack  (LIFO)
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if( x == '(' || x == '[' || x == '{'){
                st.push(x);
            }else {
                if(st.isEmpty()){
                    return false;
                }else if(!isMatching(st.peek(),x)) {
                    return false;
                }else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    static boolean isMatching(char a, char b)
    {
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
}

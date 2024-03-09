package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        String str = "{([]x)}";

        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '}' || ch == ')' || ch == ']'){
                if(!hasPair(ch,st)){
                    return false;
                }else {
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }

        return st.isEmpty();
    }

    private static boolean hasPair(char ch, Deque<Character> st) {
        if(st.isEmpty()) return false;
        return (ch == '}' && st.peek() == '{')
                || (ch == ')' && st.peek() == '(')
                || (ch == ']' && st.peek() == '[');
    }


}

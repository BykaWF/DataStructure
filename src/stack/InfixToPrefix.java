package stack;

import java.util.ArrayDeque;

public class InfixToPrefix {
    public static void main(String[] args) {
        String expression = "x+y*z";

        String ans = convertInfixToPrefix(expression);
        System.out.println(ans);
    }

    private static String convertInfixToPrefix(String expression) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        StringBuilder prefix = new StringBuilder();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char x = expression.charAt(i);
            
            if(Character.isAlphabetic(x)){
                prefix.append(x);
            } else if (x == '(') {
                st.push(x);
            } else if (x == ')') {
                while (!st.isEmpty() && st.peek() == '('){
                    char temp = st.pop();
                    prefix.append(temp);
                }
            } else if (isOperation(x)) {
                if(st.isEmpty()){
                    st.push(x);
                } else if (procedure(st.peek()) < procedure(x)) {
                    st.push(x);
                } else if (procedure(st.peek()) > procedure(x)) {
                    while (!st.isEmpty() ){
                        if(procedure(st.peek()) <= procedure(x)){
                            break;
                        }
                        prefix.append(st.pop());
                    }

                    st.push(x);
                } else if (procedure(st.peek()) == procedure(x)) {
                    prefix.append(st.pop());
                    st.push(x);
                }
            }
        }

        while (!st.isEmpty()){
            prefix.append(st.pop());
        }

        return prefix.reverse().toString();
    }

    private static boolean isOperation(char x) {
        return (x == '+' || x == '-' || x == '/' || x =='*');
    }

    private static int procedure(char x){
        if(x == '-' || x == '+'){
            return 1;
        }else if(x == '/' || x == '*'){
            return 2;
        }else {
            return 0;
        }
    }
}

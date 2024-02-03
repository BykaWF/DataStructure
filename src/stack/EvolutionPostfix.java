package stack;

import java.util.Stack;

public class EvolutionPostfix {
    public static void main(String[] args) {
        String expression = "231*+9-";

        evolutionPostfix(expression);
    }

    private static void evolutionPostfix(String expression) {

        Stack<Integer> st = new Stack<>();

        for(char x : expression.toCharArray()){
            if(Character.isDigit(x)){
                st.push(Character.getNumericValue(x));
            }else if(!Character.isWhitespace(x)){
               st.push(applyOperator(st,x));
            }
        }

        System.out.println(st.pop());
    }

    private static int applyOperator(Stack<Integer> st, char x) {

        if(x == '+'){
            return st.pop() + st.pop();
        }

        else if(x == '-'){
            return  st.pop() - st.pop();
        }
        else if(x == '*'){
            return st.pop() * st.pop();
        }
        else if(x == '/'){
           return  st.pop() / st.pop();
        }

        return -1;
    }

    private static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '*' || x == '/');
    }

    private static boolean isOperand(char x) {
        return Character.isDigit(x);
    }
}

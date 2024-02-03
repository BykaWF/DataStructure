package stack;

import java.util.Stack;

public class InfixPostfix {

    public static void main(String[] args) {

        String expression = "a+b/c-d*e";

        infixToPostfix(expression);
        System.out.println();
    }

    private static void infixToPostfix(String expression) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char x = expression.charAt(i);
            // Operand: Output it
            if(isOperand(x)){
                System.out.print(x);
            }
            // If left Parenthesis: push to stack
            else if(x == '('){
                handleLeftParenthesis(st,x);
            }
            else if(x == ')'){
                handleRightParenthesis(st,x);
            }
            else if(isOperator(x)){
               handleOperand(st,x);

            }
        }

        while (!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
    
    private static void handleOperand(Stack<Character> st, char x){
        if(st.isEmpty() || precedence(st.peek()) < precedence(x)){
            st.push(x);
        } else if (precedence(st.peek()) > precedence(x)) {
            while (!st.isEmpty() && precedence(st.peek()) >= precedence(x)){
                System.out.print(st.pop());
            }
            st.push(x);
        } else if (precedence(st.peek()) == precedence(x)) {
        System.out.print(st.pop());
        st.push(x);
    }

    }
    private static void handleLeftParenthesis(Stack<Character> st, char x) {
        st.push(x);
    }

    private static void handleRightParenthesis(Stack<Character> st, char x){
        while (!st.isEmpty()){
            char top = st.pop();
            if(top == '('){
                break;
            }
            System.out.print(top);
        }
    }
    private static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z');
    }

    private static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '*' || x == '/');
    }
    private static int precedence(char x){
        if(x == '('){
            return 0;
        }
        if(x == '+' || x == '-'){
            return 1;
        }
        if(x == '*' || x == '/'){
            return 2;
        }

        return -1;

    }

}

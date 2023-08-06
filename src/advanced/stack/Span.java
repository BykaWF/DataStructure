package advanced.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.function.ToDoubleFunction;

public class Span {
    public static void main(String[] args) {
        int[] arr = {60,10,20,40,35,30,50,70,65};
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);
        System.out.println(profit(list));

       // printSpan(arr);
    }
    //Sample Problem - Stock span problem in Java

    // ToDo: Debug with whiteboard - done V
    static void printSpan(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int span = 1;
        System.out.print(span + " ");

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <=arr[i]) {
                    stack.pop();
            }
            span = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            System.out.print(span + " ");
            stack.push(i);
        }
    }

    public static int profit(ArrayList<Integer> V)
    {
        int total = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int n = V.size();


        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= V.get(i)){
                stack.pop();
            }
            if(!stack.isEmpty()){
                total += stack.peek() - V.get(i);
                stack.push(V.get(i));
            }else{
                total += V.get(i);
                stack.push(V.get(i));
            }


        }

        return total;
    }
}

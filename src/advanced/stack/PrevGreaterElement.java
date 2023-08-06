package advanced.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PrevGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,7};
        printPrevGrater(arr);

    }

    static void printPrevGrater(int[] arr){
        Deque<Integer> st = new ArrayDeque<>();
        int n = arr.length;
        System.out.print("-1" + " ");

        st.push(arr[n-1]);

        for(int i = n-2; i >= 0; i--){
            while(!st.isEmpty() && arr[i] > st.peek()  ){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print("-1" + " ");
            }else {
                System.out.print(st.peek() + " ");
            }
            st.push(arr[i]);
        }
    }


}

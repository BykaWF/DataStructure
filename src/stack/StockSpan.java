package stack;

import java.util.ArrayDeque;
import java.util.Arrays;


public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {30,20,25,28,27,29};
        int[]stock =new int[arr.length];
        hasStock(arr, stock);

    }

    private static void hasStock(int[] arr, int[] stocks) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(0);

        stocks[0] = 1;

        for (int i = 1; i < arr.length ; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            stocks[i] = (st.isEmpty()) ? (i + 1)
                    : (i - st.peek());

            st.push(i);
        }

        System.out.println(Arrays.toString(stocks));

    }


}

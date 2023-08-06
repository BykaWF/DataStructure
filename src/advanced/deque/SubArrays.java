package advanced.deque;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {10,8,5,12,15,7,6};
        int k = 3;
        printSubArray(arr,k);
    }

    static void printSubArray(int[] arr, int k){
        int n = arr.length - k + 1;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int start = i;
            int end = i + k;

            while (start < end){
                dq.offerLast(arr[start]);
                start++;
            }

            while (dq.size() != 1){
                if(dq.peekFirst() >= dq.peekLast()){
                    dq.pollLast();
                }else {
                    dq.pollFirst();
                }
            }

            System.out.println(dq.poll());
        }

    }
}

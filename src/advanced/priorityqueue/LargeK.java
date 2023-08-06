package advanced.priorityqueue;

import java.util.*;

public class LargeK {
    public static void main(String[] args) {
        int[] arr = {5,15,10,20,8};

        printK(arr,2);
    }

    static void printK(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++){
            if(!pq.isEmpty() && arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        while (!pq.isEmpty()){
            System.out.println(pq.poll() + " ");
        }
    }
}

package advanced.priorityqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaxPurchasing {
    public static void main(String[] args) {
        long[] arr = {4, 3, 2, 6};
        int n = arr.length;
        System.out.println(minCost(arr,n));

    }

    static void maxPurchasing(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            int temp = sum;

            if(temp - arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }

    static int purchaseMax(List<Integer> al, int sum){
        PriorityQueue<Integer> pq = new PriorityQueue<>(al);
        int res = 0;

        while (sum >= 0 && !pq.isEmpty() && pq.peek() <= sum){
            sum = sum - pq.poll();
            res++;
        }
        return res;
    }

    static long minCost(long arr[], int n)
    {
        long minCost = 0;
        long sumOf = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
        }

        while (!pq.isEmpty() && pq.size() > 1){
            long con = 0;
            minCost = 0;
            while(con < 2 && !pq.isEmpty()){
                minCost += pq.poll();
                con++;
            }
            pq.add(minCost);
            sumOf += minCost;
        }


        return sumOf;
    }
}

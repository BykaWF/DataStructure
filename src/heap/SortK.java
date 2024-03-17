package heap;

import java.util.PriorityQueue;

public class SortK {
    public static void main(String[] args) {
        int[] arr = {9,8,7,18,19,17};
        int k = 2;
        sort(arr,k);
    }

    private static void sort(int[] arr,int k ) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }

        int index = 0;

        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()){
            arr[index++] = pq.poll();
        }
    }
}
